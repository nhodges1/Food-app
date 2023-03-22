package FoodApp.Controller;

import FoodApp.Model.Cart;
import FoodApp.Model.Item;
import FoodApp.Model.Account;
import FoodApp.Service.CartService;
import FoodApp.Service.ItemService;
import FoodApp.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodAppController {

    AccountService accountService;
    ItemService itemService;
    CartService cartService;

    @Autowired
    public FoodAppController(AccountService accountService, ItemService itemService, CartService cartService) {
        this.itemService = itemService;
        this.accountService = accountService;
        this.cartService = cartService;
    }

    /**
     * USER ENDPOINTS
     *
     * Endpoint on POST localhost:9000/register responds with a JSON containing username and password.
     */

    @PostMapping("register")
    public Account register(@RequestBody Account account){
        return accountService.addAccount(account);
    }

    /**
     * Endpoint on POST localhost:9000/login responds with a JSON containing username and password.
     */

    @PostMapping("login")
    public Account login(@RequestBody @NonNull Account account){
        Account exist = accountService.existingAccount(account.getUserName(), account.getPassword());
        if(exist!=null){
            return account;
        }
        else
            return null;
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

    @GetMapping("items/name/{name}")
    public List<Item> getFoodByName(@PathVariable String name){
        return itemService.getItemByName(name);
    }


    /**
     * Endpoint on GET localhost:9000/items/{cat_id} responds with a JSON containing item by category id.
     */

    @GetMapping("items/category/{catId}")
    public List<Item> getFoodByCategory(@PathVariable long catId){
        return itemService.getItemByCategory(catId);
    }


    /**
     * Endpoint on GET localhost:9000/items/{tag} responds with a JSON containing item by tag.
     */

    @GetMapping("items/tag/{tag}")
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
