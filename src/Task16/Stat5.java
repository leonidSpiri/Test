package Task16;

public class Stat5 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 500; i++) {
            int otvet = F(i);
            if (otvet == 3) result++;
        }
        System.out.println(result);
    }

    static int F(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0 && n > 0) return F(n / 2);
        if (n % 2 != 0) return 1 + F(n - 1);
        return 0;
    }
}
