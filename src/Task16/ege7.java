package Task16;

public class ege7 {
    public static void main(String[] args) {
        System.out.println(F(43)); // 1450
    }

    static int F(int n) {
        if (n == 1 || n == 2) return 1;
        if (n % 2 == 0 && n > 2) return 2 + F(n - 1);
        if (n > 2 && n % 2 != 0) return 3 * n + F(n - 2);

        return 0;
    }
}
