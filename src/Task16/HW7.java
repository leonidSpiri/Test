package Task16;

public class HW7 {
    public static void main(String[] args) {
        System.out.println(F(1));
        //1671
    }

    static int F(int n) {
        if (n > 12) return 2 * n - 5;
        if (n <= 12) return 2 * F(n + 2) + n - 4;
        return 0;
    }
}
