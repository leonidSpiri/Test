package Task22;

public class Polkov2 {
    public static void main(String[] args) {
        for (int v = 0; v < 10000; v++) {
            int x = v, L = 0, M = 1;
            while (x > 0) {
                L = L + 1;
                M = M * (x % 8);
                x = x / 8;
            }
            if (L == 3 && M == 120) System.out.println(v); //428
        }
    }
}
