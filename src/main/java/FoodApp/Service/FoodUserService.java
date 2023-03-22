package FoodApp.Service;

import FoodApp.Model.FoodAppUser;
import FoodApp.Repository.FoodAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodUserService {
    FoodAppUserRepository userRepository;

    @Autowired
    public FoodUserService(FoodAppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // new registration
   /* public FoodAppUser addAccount(FoodAppUser foodAppUser) {
        if (foodAppUser.getUserName() != "" && foodAppUser.getPassword().length() >= 4) {
            Optional<FoodAppUser> optionalUser = userRepository.
            if(optionalUser.isEmpty()) {
                userRepository.save(foodAppUser);
                return foodAppUser;
            }
        }
        return null;
    }*/
    public FoodAppUser addAccount(FoodAppUser foodAppUser) {
        if (foodAppUser.getUserName() != "" && foodAppUser.getPassword().length() >= 4) {
            FoodAppUser persistedUser = userRepository.save(foodAppUser);
            return persistedUser;

        }
        return null;
    }


    // login with existing account
  /*  public FoodAppUser existingAccount(String username, String password) {
        Optional<FoodAppUser> optionalUser = userRepository.getUserByName(username);
        FoodAppUser foodAppUser = optionalUser.get();
        if (foodAppUser.getPassword() == password)
            return foodAppUser;
        else
            return null;
    }
}*/
}