package Task25;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Fipi1 {
    public static void main(String[] args) {
        int chislo = 452021, n = 0;
        while (n != 5) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i = 2; i <= chislo / 2; i++) {
                if (chislo % i == 0) {
                    min = min(min, i);
                    max = max(max, i);
                }
            }
            int m = max + min;
            if (m % 7 == 3) {
                System.out.println(chislo + " " + m);
                n++;

            }
            chislo++;
        }
    }
}
