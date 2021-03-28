package Task16;

public class Task4 {
    static int result = 0;

    public static void main(String[] args) {
        for (int i = 200; i > 0; i--) {
            result = 0;
            F(i);
            if (result > 3200000) System.out.println(i + "  -   " + result);
            //199 3238315
        }
    }

    static void F(int n) {
        result += n * n;
        if (n > 1) {
            result += 2 * n + 1;
            F(n - 2);
            F(n / 3);
        }
    }
}
