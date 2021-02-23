package Task22;

public class ege2 {
    public static void main(String[] args) {
        for (int d = 0; d < 10000; d++) {
            int x = d, q = 25, l = 0, m = 0;
            while (x >= q) {
                l++;
                x -= q;
            }
            m = x;
            if (m < l) {
                m = l;
                l = x;
            }
            if (l == 2 && m == 8) System.out.println(d);
        }
    }
}
