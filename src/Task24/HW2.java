package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_2.txt"));
        String s = in.nextLine();
        int now = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'A' && s.charAt(i) != 'E') now++;
            else {
                res = Math.max(res, now);
                now = 0;
            }
        }
        System.out.println(res);
    }
}
