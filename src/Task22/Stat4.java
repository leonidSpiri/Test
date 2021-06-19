package Task22;

public class Stat4 {
    public static void main(String[] args) {
        for (int v = 10000; v > 1; v--) {
            int x = v, k = 0, a = 0, b = 0, d = 0;
            k = x % 9;
            while (x > 0) {
                d = x % 9;
                if (d == k) a++;
                b += d;
                x /= 9;
            }
            if (a == 3 && b == 10) System.out.println(v); //874
        }
    }
}
