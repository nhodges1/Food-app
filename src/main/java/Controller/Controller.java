package Controller;

import Model.Cart;
import Model.Fooditem;
import Model.User;
import Service.CartService;
import Service.FooditemService;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return userService.register(user);
    }

    /**
     * Endpoint on POST localhost:9000/login responds with a JSON containing username and password.
     */

    @PostMapping("login")
    public User login(@RequestBody User user){
        return userService.login(user);
    }


    /**
     * FOOD ENDPOINTS
     *
     * Endpoint on GET localhost:9000/items responds with a JSON containing all foods.
     */

    @GetMapping("items")
    public Fooditem getAllFoods() throws Exception {
        return fooditemService.getAllFoods();
    }

    /**
     * Endpoint on GET localhost:9000/items/{name} responds with a JSON containing item by name.
     */

    @GetMapping("items/{name}")
    public Fooditem getFoodByName(@PathVariable String name){
        return fooditemService.getFoodByName(name);
    }


    /**
     * Endpoint on GET localhost:9000/items/{cat_id} responds with a JSON containing item by category id.
     */

    @GetMapping("items/{cat_id}")
    public Fooditem getFoodByCategory(@PathVariable long id){
        return fooditemService.getFoodByCategory(id);
    }


    /**
     * Endpoint on GET localhost:9000/items/{tag} responds with a JSON containing item by tag.
     */

    @GetMapping("items/{tag}")
    public Fooditem getFoodByTag(@PathVariable long id){
        return fooditemService.getFoodByTag(id);
    }


    /**
     * Endpoint on GET localhost:9000/items/{ingredient} responds with a JSON containing item by ingredient.
     */
    @GetMapping("items/{ingredient}")
    public Fooditem getFoodByIngredient(@PathVariable String ingredient){
        return fooditemService.getFoodByIngredient(ingredient);
    }



    /**
     * CART ENDPOINTS
     *
     * Endpoint on GET localhost:9000/{user_id}/cart
     */

    @GetMapping("{user_id}/cart")
    public Cart getCart(@PathVariable long id){
        return cartService.getCart(id);
    }


}
