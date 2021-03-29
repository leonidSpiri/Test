package Task16;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(F(5));
    }

    static int F(int n) {
        if (n > 1) return F(n - 1) + G(n - 1);
        return n;
    }

    static int G(int n) {
        if (n > 1) return G(n - 1) + F(n);
        return n;
    }
}
