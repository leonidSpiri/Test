package Task16;

public class Stat4 {
    public static void main(String[] args) {
        for (int i = 100000; i > 0; i--) {
            int otvet = F(i);
            if (otvet == 11) System.out.println(i); // 485
        }
    }

    static int F(int n) {
        if (n == 0) return 0;
        if (n % 3 == 0 && n > 0) return F(n / 3);
        if (n % 3 > 0) return n % 3 + F(n - (n % 3));
        return 0;
    }
}
