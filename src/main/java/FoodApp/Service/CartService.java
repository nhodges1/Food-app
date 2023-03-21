package FoodApp.Service;

import FoodApp.Model.Cart;
import FoodApp.Model.Fooditem;
import FoodApp.Repository.CartRepository;
import FoodApp.Repository.FooditemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService {
    CartRepository cartRepository;
    FooditemRepository fooditemRepository;
    @Autowired
    public CartService(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }

    public List<Cart> getCart(long id){
        return cartRepository.getCart(id);
    }
}
