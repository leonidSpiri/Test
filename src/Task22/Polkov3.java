package Task22;

public class Polkov3 {

    public static void main(String[] args) {
        for (int v = 0; v < 10000; v++) {
            int x = v, L = 0, M = 0;
            while (x > 0) {
                L = L + 1;
                if (M < x % 10) {
                    M = x % 10;
                }
                x = x / 10;
            }
            if (L == 3 && M == 7) System.out.println(v); //777
        }
    }
}
