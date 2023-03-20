package Service;

public class UserService {

    // new registration
        public Account addAccount (Account account) {
            if(account.username != "" && account.password.length() >= 4) {
                return account;
            }
                return null;
        }

    // login with existing account
    public Account existingAccount (String username, String password) {
        return (username, password) ;
    }
