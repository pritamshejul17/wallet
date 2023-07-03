package model;

public class User {
    String userName;
    Wallet wallet;

    public User(String userName, Double initialBalance) {
        this.userName = userName;
        this.wallet = new Wallet(userName, initialBalance);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
