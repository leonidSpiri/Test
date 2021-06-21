package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fipi1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/Fipi1_24.txt"));
        int result = 0;
        while (in.hasNext()) {
            String s = in.next();
            int now = 0, res = 0;
            for (int i = 0; i < s.length() - 3; i++) {
                if (s.charAt(i) != 'X' && s.charAt(i + 1) != 'Z' && s.charAt(i + 2) != 'Z' && s.charAt(i + 3) != 'Y') {
                    now++;
                } else {
                    res = Math.max(res, now);
                    now = 0;
                }
            }
            result = Math.max(res, result);
        }

        System.out.println(result);
    }
}
