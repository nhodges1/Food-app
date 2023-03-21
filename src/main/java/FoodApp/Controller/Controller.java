package FoodApp.Controller;

import FoodApp.Model.Cart;
import FoodApp.Model.Item;
import FoodApp.Model.User;
import FoodApp.Service.CartService;
import FoodApp.Service.ItemService;
import FoodApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    UserService userService;
    ItemService itemService;
    CartService cartService;

    @Autowired
    public Controller(UserService userService, ItemService itemService, CartService cartService) {
        this.itemService = itemService;
        this.userService = userService;
        this.cartService = cartService;
    }

    /**
     * USER ENDPOINTS
     *
     * Endpoint on POST localhost:9000/register responds with a JSON containing username and password.
     */

    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.addAccount(user);
    }

    /**
     * Endpoint on POST localhost:9000/login responds with a JSON containing username and password.
     */

    @PostMapping("login")
    public User login(@RequestBody User user){
        return userService.existingAccount(user.getUserName(), user.getPassword());
    }


    /**
     * FOOD ENDPOINTS
     *
     * Endpoint on GET localhost:9000/items responds with a JSON containing all foods.
     */

    @GetMapping("items")
    public List<Item> getAllFoods() throws Exception {
        return itemService.getAllFoods();
    }

    /**
     * Endpoint on GET localhost:9000/items/{id} responds with a JSON containing item by name.
     */

    @GetMapping("items/{id}")
    public Item getItemById(@PathVariable long id){
        return itemService.getItemById(id);
    }


    /**
     * Endpoint on GET localhost:9000/items/{name} responds with a JSON containing item by name.
     */

    @GetMapping("items/{name}")
    public List<Item> getFoodByName(@PathVariable String name){
        return itemService.getItemByName(name);
    }


    /**
     * Endpoint on GET localhost:9000/items/{cat_id} responds with a JSON containing item by category id.
     */

    @GetMapping("items/{cat_id}")
    public Item getFoodByCategory(@PathVariable long id){
        return itemService.getItemByCategory(id);
    }


    /**
     * Endpoint on GET localhost:9000/items/{tag} responds with a JSON containing item by tag.
     */

    @GetMapping("items/{tag}")
    public List<Item> getFoodByTag(@PathVariable String tag){
        return itemService.getItemByTag(tag);
    }


    /**
     * CART ENDPOINTS
     *
     * Endpoint on GET localhost:9000/{user_id}/cart
     */

    @GetMapping("{user_id}/cart")
    public List<Cart> getCart(@PathVariable long id){
        return cartService.getCart(id);
    }


}
