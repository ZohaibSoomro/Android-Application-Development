package week4.task;

public class TestMax {
    public static void main(String[] args) {
        Max m=new Max();
        System.out.println(m.max(2,3));
        System.out.println(m.max(2,3,5));
        System.out.println(m.max(2,3,6,8));
        System.out.println(m.max(20,3,5,9,11));
        System.out.println(m.max(20,3,56,5,9,11));

    }
}
