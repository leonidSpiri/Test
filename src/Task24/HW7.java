package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_7.txt"));
        String s = in.nextLine();
        int now = 1, res = 0;
        char buff = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == buff) now++;
            else {
                res = Math.max(res, now);
                now = 1;
                buff = s.charAt(i);
            }
        }
        now = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == buff) now++;
            else {
                if (now == res) {
                    System.out.println(s.charAt(i - 1) + " " + res);

                }
                now = 1;
                buff = s.charAt(i);
            }
        }
    }
}
