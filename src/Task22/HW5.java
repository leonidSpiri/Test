package Task22;

public class HW5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int x = i, a = 0, b = 1;
            while (x > 0) {
                if (x % 2 > 0) a += x % 12;
                else b *= x % 12;
                x /= 12;
            }
            if (a == 7 && b == 12) System.out.printf("i = %d, x = %d\n", i, x);
        }
        //i = 367
    }
}
