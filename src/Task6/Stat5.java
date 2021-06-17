package Task6;

public class Stat5 {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                int s = i, x = j, n = 1;
                s = (100 * s) + x;
                while (s < 2021) {
                    s = s + 5 * n;
                    n++;
                }
                if (n == 15) System.out.println(" j = " + j); //1
            }
        }
    }
}
