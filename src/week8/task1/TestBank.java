package week8.task1;

public class TestBank {
    public static void main(String[] args) {
        BankA a=new BankA();
        BankB b=new BankB();
        BankC c=new BankC();
        System.out.println("Bank A balance: $"+a.getBalance());
        System.out.println("Bank B balance: $"+b.getBalance());
        System.out.println("Bank C balance: $"+c.getBalance());
    }
}
