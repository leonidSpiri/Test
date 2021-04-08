package Task22;

public class ege4 {
    public static void main(String[] args) {
        for (int i = 10000; i > 0; i--) {
            int x = i, l = 0, m = 0, q = 2;
            while (x >= 5) {
                l++;
                x /= q;
            }
            m = x;
            if (m < l) {
                m = l;
                l = x;
            }
            if (l == 3 && m == 4) System.out.println(i); //32
        }
    }
}
