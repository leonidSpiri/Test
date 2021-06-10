package Task16;

public class Stat3 {
    public static void main(String[] args) {
        for (int i = 100000; i > 0 ; i--) {
            int otvet  = F(i);
            if (otvet == 12) System.out.println(i); // 4095
        }
    }

    static int F(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0 && n > 0) return  F(n / 2);
        if (n % 2 != 0) return 1 + F(n - 1);
        return 0;
    }
}
