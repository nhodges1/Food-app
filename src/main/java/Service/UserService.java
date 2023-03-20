package Service;

import Model.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    // new registration
    public User addAccount(User user) {
        if (user.getUserName() != "" && user.getPassword().length() >= 4) {
            Optional<User> addAccount(User user);
            return user;
        }
        return null;
    }

    // login with existing account
    public User existingAccount(String username, String password) {
        User user = userRepository.getUserByName(username);
        if (user.getPassword() == password)
            return user;
        else
            return null;
    }
}
