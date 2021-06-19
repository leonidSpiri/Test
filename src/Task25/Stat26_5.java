package Task25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stat26_5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/stat4-26.txt"));
        ArrayList<Long> arrayList = new ArrayList<Long>();
        ArrayList<Long> chet = new ArrayList<Long>();
        while (in.hasNext()) {
            Long buff = in.nextLong();
            if (buff % 2 == 0) chet.add(buff);
            arrayList.add(buff);
        }
        int kolvo = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < chet.size() - 1; i++) {
            for (int j = i + 1; j < chet.size(); j++) {
                long one = chet.get(i), two = chet.get(j);
                long sred = (one + two) / 2;
                if (arrayList.contains(sred)) {
                    kolvo++;
                    max = Math.max(max, sred);
                }

            }
        }
        System.out.println("kolvo = " + kolvo + " max = " + max); // kolvo = 15 max = 976339247
    }
}
