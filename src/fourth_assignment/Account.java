package fourth_assignment;

public class Account {
    private String title;
    private String accountNumber;
    private double balance;
    private int pin;
    private UserList user;

    public Account(String title, String accountNumber, double balance, int pin, UserList user) {
        this.title = title;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
        this.user = user;
    }

    public UserList getUser() {
        return user;
    }

    public void setUser(UserList user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
