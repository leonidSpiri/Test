package Task16;

public class HW8 {
    public static void main(String[] args) {
        System.out.println(F(20));
        //1343116
    }

    static int F(int n) {
        if (n < 5) return 5 - n;
        if (n % 3 == 0) return 4 * (n - 5) * F(n - 5);
        if (n % 3 != 0) return 3 * n + 2 * F(n - 1) + F(n - 2);
        return 0;
    }
}
