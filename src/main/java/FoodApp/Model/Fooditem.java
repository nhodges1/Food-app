package FoodApp.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Fooditem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodId;
    private String foodName;
    private int categoryId;
    private String categoryName;
    private String description;
    private int priceOfItem;
    private String foodTag;

    @OneToMany(fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Fooditem> fooditem;
}