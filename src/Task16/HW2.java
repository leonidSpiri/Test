package Task16;

public class HW2 {
    public static void main(String[] args) {
        F(9);
        //1250249
    }

    static void F(int n) {
        if (n > 3) {
            F(n - 4);
            F(n / 2);
        }
        System.out.print(n);
    }
}
