package Task6;

public class Polkov3 {
    public static void main(String[] args) {

        for (int i = 1000; i > -1000; i--) {
            int s = i, n = 50;

            while (s > 0) {
                s = s / 2;
                n = n - 3;
            }
            if (n == 23) System.out.println(i); //256
        }
    }
}
