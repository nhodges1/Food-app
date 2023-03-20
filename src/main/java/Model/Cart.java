package Model;

public class Cart {
    public int user_id;
    public int cart_id;
    public int item_id;
    public int quantity;

    public Cart(){}

    public Cart(int user_id, int cart_id, int item_id, int quantity){
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
