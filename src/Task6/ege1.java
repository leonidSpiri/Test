package Task6;

public class ege1 {
    public static void main(String[] args) {
        for (int d = 100000; d > 1; d--) {
            int s = d, n = 1;
            while (s * n < 4096) {
                s /= 2;
                n *= 4;
            }
            if (n == 1024)
                System.out.println(d);
        }

    }
}
