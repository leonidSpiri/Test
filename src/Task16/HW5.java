package Task16;

public class HW5 {
    static int result = 0;

    public static void main(String[] args) {
        F(40);
        System.out.println(result);
        //22947841
    }

    private static void F(int n) {
        result++;
        if (n >= 1) {
            result++;
            F(n - 1);
            F(n - 3);
            result++;
        }
    }
}
