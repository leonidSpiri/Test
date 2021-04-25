package Task22;

public class Polkov1 {
    public static void main(String[] args) {
        for (int v = 10000; v >= 100; v--) {
            int x = v, L = 1, M =0;
            L = x; M = 65;
            if (L % 2 == 0) M = 52;
            while (L != M) {
                if(L > M)
                    L = L - M;
                else
                    M = M - L;
            }
            if (M == 26) System.out.println(v); //83
        }
    }
}
