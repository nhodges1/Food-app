package Service;

import Model.Cart;
import Model.Fooditem;
import Repository.CartRepository;
import Repository.FooditemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class CartService {
    CartRepository cartRepository;
    FooditemRepository fooditemRepository;
    @Autowired
    public CartService(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }
}
