package Task22;

public class HW1 {
    public static void main(String[] args) {
        for (int q = 0; q < 10000; q++) {
            int x = q, a = 0, b = 10, d = 0;
            while (x > 0) {
                d = x % 7;
                if (d > a) a = d;
                if (d < b) b = d;
                x /= 7;
            }
            if (a + b == 11) System.out.printf("q = %d, x = %d, a =  %d, b = %d, d = %d\n", q, x, a, b, d);
        }
        //q = 41
    }
}
