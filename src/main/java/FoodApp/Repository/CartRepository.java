package FoodApp.Repository;

import FoodApp.Model.Cart;
import FoodApp.Model.Fooditem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository  extends JpaRepository<Cart, Long>{
    @Query("FROM carts WHERE cart_id = :=id")
    List<Cart> getCart(@Param("id") long id);
}
