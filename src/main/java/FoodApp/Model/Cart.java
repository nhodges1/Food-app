package FoodApp.Model;

import jakarta.persistence.Entity;

@Entity
public class Cart {
    private int user_id;
    private int cart_id;
    private int item_id;
    private int quantity;

    private Cart(){}

    private Cart(int user_id, int cart_id, int item_id, int quantity){
        this.user_id = user_id;
        this.cart_id = cart_id;
        this.item_id = item_id;
        this.quantity = quantity;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
