package Task6;

public class polkov2 {
    public static void main(String[] args) {
        for (int i = 1000; i > -1000; i--) {
            int s = i, n = 0;

            while (s < 1000) {
                s = s * 2;
                n = n + 5;
            }
            if (n == 10) System.out.println(i); //250
        }
    }
}
