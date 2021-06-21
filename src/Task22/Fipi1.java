package Task22;

public class Fipi1 {
    public static void main(String[] args) {
        for (int d = 100000; d > 0; d--) {
            int x = d, l = 0, m = 0;
            while (x > 0) {
                m++;
                if (x % 2 != 0) l++;
                x /= 2;
            }

            if (l == 5 && m == 8) {
                System.out.printf("d=%d\n", d); // 143
            }
        }
    }
}
