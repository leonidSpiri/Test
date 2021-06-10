package Task22;

public class Stat3 {
    public static void main(String[] args) {
        for (int v = 10000; v > 1; v--) {
            int x = v, m = 0, s = 0, d = 0;
            while (x > 0) {
                d = x % 8;
                s += d;
                if (d > m) m = d;
                x /= 8;
            }
            if (m == 5 && s == 12) System.out.println(v); //173
        }
    }
}
