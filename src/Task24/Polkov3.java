package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polkov3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/24-s1.txt"));
        int res = 0;
        while (in.hasNext()) {
            String s = in.nextLine();
            int kolvo = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'Y' && s.charAt(i + 1) == 'Z') kolvo++;
            }
            if (kolvo > 1) res++;
        }
        System.out.println(res);//433
    }
}
