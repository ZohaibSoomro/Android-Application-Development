package week4;

public class TestMath {
    public static void main(String[] args) {
        System.out.println("Add(2,3): " + MathClass.add(2, 3));
        System.out.println("Add(2,3,6): " + MathClass.add(2, 3, 8));
        System.out.println("Add(2.3,3.6): " + MathClass.add(2.3, 3.5));
        System.out.println("Add(2.3,3.6,4.7): " + MathClass.add(2.3, 3.5, 4.7));
        System.out.println("Add(2.3,3.6,4.7,2): " + MathClass.add(2.3, 3.5, 4.7, 2));
    }
}
