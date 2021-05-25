package Task22;

public class stat1 {
    public static void main(String[] args) {
        for (int v = 10000; v > 0; v--) {
            int x = v, a = 1;
            while (x > 0) {
                a *= x % 7;
                x = x / 7;
            }
            if (a == 48) System.out.println(v); //132
        }
    }
}
