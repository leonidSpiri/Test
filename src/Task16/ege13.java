package Task16;

public class ege13 {
    public static void main(String[] args) {
        System.out.println(F(13)); // 50
    }

    static int F(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n % 2 == 0 && n > 2) return (n * F(n - 1)) / 2;
        if (n > 2 && n % 2 != 0) return (n * (F(n - 1) + F(n - 2))) / 3;
        return 0;
    }
}
