package week4.task;

public class Max {
    public int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }


    public int max(int a, int b, int c, int d) {
        return max(max(max(a, b), c), d);
    }

    public int max(int a, int b, int c, int d, int e) {
        return max(max(max(max(a, b), c), d), e);
    }

    public int max(int a, int b, int c, int d, int e, int f) {
        return max(max(max(max(max(a, b), c), d), e), f);
    }

}


