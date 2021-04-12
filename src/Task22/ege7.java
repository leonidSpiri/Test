package Task22;

public class ege7 {
    public static void main(String[] args) {
        for (int v = 1; v < 100000; v++) {
            int x = v, p = 0, s, i = 1;
            s = 5 * (x - x % 21);
            while (p < s) {
                s = s - 3 * i;
                p += i;
                i++;
            }

            if (s == 42 && p == 91) System.out.println(v); //83
        }
    }
}
