package Task16;

public class HW4 {
    static int result = 0;

    public static void main(String[] args) {
        for (int i = 60; i > 0; i--) {
            result = 0;
            F(i);
            if (result > 3200000) System.out.println(i + " " + result);
            //46 3267851
        }
    }

    static void F(int n) {
        result += (n - 5);
        if (n > 1) {
            result += (n + 8);
            F(n - 2);
            F(n - 3);
        }
    }
}
