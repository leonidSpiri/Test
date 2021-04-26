package Task16;

public class ege16 {
    public static void main(String[] args) {
        System.out.println(F(14)); // 50
    }

    static int F(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) return (int) (Math.pow(2, n)+F(n-1));
        if (n > 1 && n % 2 != 0) return n+F(n-2);
        return 0;
    }
}
