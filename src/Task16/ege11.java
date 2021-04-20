package Task16;

public class ege11 {
    public static void main(String[] args) {
        System.out.println(F(50)); // 6646
    }

    static int F(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n % 2 == 0 && n > 2) return (7*n+F(n-3))/9;
        if (n > 2 && n % 2 != 0) return (5*n+F(n-1) + F(n-2))/7;
        return 0;
    }
}
