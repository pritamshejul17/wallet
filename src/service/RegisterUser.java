package service;

import model.User;
import respository.WalletRepository;

public class RegisterUser {
    private User user;
    public RegisterUser(String userName, Double balance) {
        this.user = new User(userName, balance);
        WalletRepository.add(user);
    }

}
