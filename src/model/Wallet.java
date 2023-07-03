package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private String userName;
    private LocalTime createdAt;
    private ArrayList<Transaction> transactions;
    private double balance;

    public Wallet(String userName, Double balance) {
        this.userName = userName;
        this.createdAt = LocalTime.now();
        this.transactions = new ArrayList<Transaction>();
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }
}
