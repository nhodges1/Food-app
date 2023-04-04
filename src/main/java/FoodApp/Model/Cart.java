package FoodApp.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;

    private Double totalPrice;
}
