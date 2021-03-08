package Task22;

public class ege3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int x = i, q = 2, l = 0, m = 0;
            while (x >= 5) {
                l++;
                x /= q;
            }
            m = x;
            if (m < l) {
                m = l;
                l = x;
            }
            if (l == 2 && m == 4) System.out.println(i);
        }
    }
}
