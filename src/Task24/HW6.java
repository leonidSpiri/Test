package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_6.txt"));
        String s = in.nextLine();
        int res = 0, index = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) < s.charAt(i + 1)) && (s.charAt(i + 2) < s.charAt(i + 1))) {
                res++;
                index = i;
            }
        }
        System.out.print(res + " " + index);
    }
}
