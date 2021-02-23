package Task6;

public class ege2 {
    public static void main(String[] args) {
        for (int d = 100000; d > 0; d--) {
            int s = d, n = 2;
            while (s * n <= 4096) {
                s /= 2;
                n *= 4;
            }
            if (n == 2048) System.out.println(d);
        }
    }
}
