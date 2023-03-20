package Repository;

import Model.Fooditem;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FooditemRepository extends JpaRepository<Fooditem, Long>{
}
