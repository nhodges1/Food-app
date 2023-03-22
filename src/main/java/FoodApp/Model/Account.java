package FoodApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private String userName;
    private String name;
    private String email;
    private String password;

    public Account(){

    }
    public Account(String userName, String name, String email, String password){
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
