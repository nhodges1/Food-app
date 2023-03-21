package FoodApp.Controller;

import FoodApp.Model.Cart;
import FoodApp.Model.Fooditem;
import FoodApp.Model.User;
import FoodApp.Service.CartService;
import FoodApp.Service.FooditemService;
import FoodApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    UserService userService;
    FooditemService fooditemService;
    CartService cartService;

    @Autowired
    public Controller(UserService userService, FooditemService fooditemService, CartService cartService) {
        this.fooditemService = fooditemService;
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
    public List<Fooditem> getAllFoods() throws Exception {
        return fooditemService.getAllFoods();
    }

    /**
     * Endpoint on GET localhost:9000/items/{name} responds with a JSON containing item by name.
     */

    @GetMapping("items/{name}")
    public List<Fooditem> getFoodByName(@PathVariable String name){
        return fooditemService.getFooditemByName(name);
    }


    /**
     * Endpoint on GET localhost:9000/items/{cat_id} responds with a JSON containing item by category id.
     */

    @GetMapping("items/{cat_id}")
    public Fooditem getFoodByCategory(@PathVariable long id){
        return fooditemService.getFooditemByCategory(id);
    }


    /**
     * Endpoint on GET localhost:9000/items/{tag} responds with a JSON containing item by tag.
     */

    @GetMapping("items/{tag}")
    public List<Fooditem> getFoodByTag(@PathVariable long id){
        return fooditemService.getFooditemByTag(id);
    }


    /**
     * Endpoint on GET localhost:9000/items/{ingredient} responds with a JSON containing item by ingredient.
     */
    @GetMapping("items/{ingredient}")
    public List<Fooditem> getFoodByIngredient(@PathVariable String ingredient){
        return fooditemService.getFooditemByIngredient(ingredient);
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
