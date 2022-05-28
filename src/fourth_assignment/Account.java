package fourth_assignment;

public class Account {
    private String accountName;
    private String accountNumber;
    private double balance;
    private int pin;

    public Account(String accountName, String accountNumber, double balance, int pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
