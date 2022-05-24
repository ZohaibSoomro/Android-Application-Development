package first_test;

public class Q10 {
    public static void main(String[] args) {
        oddStuff();
    }

    public static void oddStuff() {
        int n=4;
        for (int i = 0; i < n; i++) {
            System.out.println(n);
            n=n/2;
        }
    }
}
