package Task16;

public class Task3 {
    static int result = 0;

    public static void main(String[] args) {
        F(35);
        System.out.println(result);
        //
        // 96631265
    }

    static void F(int n) {
        result++;
        if (n >= 1) {
            result++;
            F(n - 1);
            F(n - 2);
            result++;
        }
    }
}
