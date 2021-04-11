package Task22;

public class ege6 {
    public static void main(String[] args) {
        for (int v = 1; v < 100000; v++) {
            int x = v, p = 0, s, i = 1;
            s = 7 * (x - x % 25);
            while (p < s) {
                s = s - 2 * i;
                p += i;
                i++;
            }

            if (s == 110 && p == 120) System.out.println(v); //74
        }
    }
}
