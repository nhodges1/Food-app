package FoodApp.Service;

import FoodApp.Model.Account;
import FoodApp.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // new registration
   public Account addAccount(Account account) {
        if (account.getUserName() != "" && account.getPassword().length() >= 4) {
            Optional<Account> optionalUser = accountRepository.getUserByName(account.getUserName());
            if(optionalUser.isEmpty()) {
                accountRepository.save(account);
                return account;
            }
        }
        return null;
    }
    /*public Account addAccount(Account account) {
        if (account.getUserName() != "" && account.getPassword().length() >= 4) {
            Account persistedUser = accountRepository.save(account);
            return persistedUser;

        }
        return null;
    }*/


    // login with existing account
    public Account existingAccount(String username, String password) {
        Optional<Account> optionalUser = accountRepository.getUserByName(username);
        Account account = optionalUser.get();
        if (account.getPassword() == password)
            return account;
        else
            return null;
    }
}