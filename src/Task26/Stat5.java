package Task26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stat5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/stat5_26.txt"));
        ArrayList<Long> arrayList = new ArrayList<Long>();
        while (in.hasNext()) {
            Long buff = in.nextLong();
            arrayList.add(buff);
        }
        int kolvo = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                long one = arrayList.get(i), two = arrayList.get(j);
                long sum = (one + two);
                if (one % 2 != two % 2) {
                    if (arrayList.contains(sum)) {
                        kolvo++;
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println("kolvo = " + kolvo + " max = " + max); // kolvo = 15 max = 954387771
    }
}
