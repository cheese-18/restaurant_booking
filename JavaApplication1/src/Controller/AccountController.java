package Controller;

import Model.Account;
import Model.AccountStorage;

public class AccountController {

    public void registerAccount(String fn, String ln, String email, String contact, String pass) {

        Account acc = new Account(fn, ln, email, contact, pass);
        AccountStorage.accounts.add(acc);

    }

    public boolean login(String email, String pass) {

        for(Account acc : AccountStorage.accounts){

            if(acc.getEmail().equals(email) && acc.getPassword().equals(pass)){
                return true;
            }

        }

        return false;
    }
}