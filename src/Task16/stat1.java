package Task16;

public class stat1 {
    public static void main(String[] args) {
        System.out.println(F(60));
        //54000
    }

    static int F(int n) {
        if (n == 1) return 1;
        if (n % 2 != 0 && n > 1) return n + F(n - 2);
        if (n % 2 == 0) return n * F(n - 1);
        return 0;
    }
}
