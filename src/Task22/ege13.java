package Task22;

public class ege13 {
    public static void main(String[] args) {
        for (int v = 10000; v > 0; v--) {
            int x = v, l = 0, m = 0;
            while (x > 0) {
                m++;
                if (x % 2 != 0) {
                    l++;
                }
                x /= 2;
            }

            if (l == 4 && m == 7) System.out.println(v); //71
        }
    }
}
