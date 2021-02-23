package Task22;

public class ege1 {
    public static void main(String[] args) {
        for (int d = 0; d < 100000; d++) {
            int x = d, l = 0, m = 0, q = 15;
            while (x >= q) {
                l++;
                x -= q;
            }
            m = x;
            if (m < l) {
                m = l;
                l = x;
            }
            if (l == 3 && m == 7) {
                System.out.printf("d=%d, x=%d, q=%d\n", d, x, q);
            }
        }
    }
}
