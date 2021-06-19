package Task25;

import java.util.ArrayList;
import java.util.Collections;

public class Stat5 {
    public static void main(String[] args) {
        int m = 0, n = 1;

        ArrayList<Long> array = new ArrayList<>();
        while (Math.pow(2, m) <= 400_000_000) {
            n = 1;
            while (Math.pow(2, m) * Math.pow(3, n) <= 400_000_000) {
                if (Math.pow(2, m) * Math.pow(3, n) >= 200_000_000) {
                    array.add((long) (Math.pow(2, m) * Math.pow(3, n)));
                }
                n += 2;
            }
            m += 2;
        }
        Collections.sort(array);
        System.out.println(array);
    }

}
