package Task22;

public class HW3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int x = i, q = 16, l = 0, m = 0;
            while (x >= q) {
                l++;
                x -= q;
            }
            m = x;
            if (m < l) {
                m = l;
                l = x;
            }
            if (l == 8 && m == 11) System.out.printf("i = %d, x = %d, m =  %d, m = %d, q = %d\n", i, x, m, l, q);
        }
        // i = 184
    }
}
