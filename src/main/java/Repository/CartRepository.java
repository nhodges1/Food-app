package Repository;

import Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CartRepository  extends JpaRepository<Cart, Long>{
}
