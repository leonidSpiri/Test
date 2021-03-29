package Task16;

public class HW3 {
    static int result = 0;

    public static void main(String[] args) {
        F(5);
        System.out.println(result);
    }

    static void F(int n) {
        result++;
        if (n > 0) {
            result++;
            F(n - 2);
            F(n - 1);
            F(n - 1);
        }
    }
}
