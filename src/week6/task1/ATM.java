package week6.task1;

public class ATM {
    private String ownerName;
    private double amount;
    private int pin;

    public ATM() {
    }

    public ATM(String ownerName, double amount, int pin) {
        this.ownerName = ownerName;
        this.amount = amount;
        this.pin = pin;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 500) {
            this.amount = amount;
        }
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
