package Task22;

public class HW9 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int x = i, a = 0, b = 1;
            while (x > 0) {
                if (x % 2 > 0) a += x % 6;
                else b += x % 6;
                x /= 6;
            }
            if (a == 2 && b == 7) System.out.printf("i = %d, x = %d\n", i, x);
        }
        // i = 943
    }
}
