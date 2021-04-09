package Task22;

public class ege5 {
    public static void main(String[] args) {
        for (int v = 1; v < 100000; v++) {
            int p = 0, s, i = 1;
            s = 6 * (v - v % 22);
            while (p < s) {
                s = s - 2 * i;
                p += i;
                i++;
            }

            if (s == 82 && p == 91) System.out.println(v); //65
        }
    }
}
