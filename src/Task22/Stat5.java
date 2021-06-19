package Task22;

public class Stat5 {
    public static void main(String[] args) {
        for (int v = 10000; v > 1; v--) {
            int x = v, k = 0, a = 0, b = 0, d = 0;
            a = 3 * x + 23;
            b = 3 * x - 17;
            while (a != b) {
                if (a > b) a -= b;
                else b -= a;
            }
            if (a == 20) System.out.println(v); //39
        }
    }
}
