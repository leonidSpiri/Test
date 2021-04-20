package Task22;

public class ege11 {
    public static void main(String[] args) {
        for (int v = 0; v < 100000; v++) {
            int x = v, l = 0, m = 0;
            while (x > 0) {
                m++;
                if (x % 8 > 4) {
                    l = l + (x % 8);
                }
                x /= 8;
            }

            if (l == 12 && m == 4) System.out.println(v); //3940
        }
    }
}
