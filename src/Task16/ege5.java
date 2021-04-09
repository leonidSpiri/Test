package Task16;

public class ege5 {
    public static void main(String[] args) {
        System.out.println(F(18)); // 6562
    }

    static int F(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) return 2 * F(n - 1);
        if (n > 1 && n % 2 != 0) return 3 * F(n - 2) - 1;

        return 0;
    }
}
