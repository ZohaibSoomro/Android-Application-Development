package week6.task1;

import week6.User;

public class ATM {
    private String ownerName;
    private double amount;
    private int accountNumber;
    private int pin;
    private User user;

    public ATM() {
    }

    public ATM(String ownerName, double amount, int accountNumber, int pin,User user) {
        this.ownerName = ownerName;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.user=user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 500) {
            this.amount = amount;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {

        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getPin() {
        return pin;
    }
}
