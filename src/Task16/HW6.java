package Task16;

public class HW6 {
    public static void main(String[] args) {
        System.out.println(F(14) + G(14));
        //37282721
    }

    static int F(int n) {
        if (n == 1) return n;
        if (n > 1) return 3 * F(n - 1) + G(n - 1) - n + 5;
        return 0;
    }

    private static int G(int n) {
        if (n == 1) return n;
        if (n > 1) return F(n - 1) + 3 * G(n - 1) - 3 * n;
        return 0;
    }
}
