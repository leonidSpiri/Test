package Task16;

public class ege10 {
    public static void main(String[] args) {
        System.out.println(F(21)); // 6646
    }

    static int F(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n % 2 == 0 && n > 2) return F(n - 2) + F(n - 3) + 10;
        if (n > 2 && n % 2 != 0) return F(n - 1) + F(n - 2);

        return 0;
    }
}
