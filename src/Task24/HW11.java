package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_11.txt"));
        String s = in.nextLine();
        int res = 0;
        for (int i = 0; i < s.length() - 5; i++) {
            if (s.charAt(i) != 'A' && s.charAt(i + 5) != 'A') {
                if (s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'O' && s.charAt(i + 3) == 'S' && s.charAt(i + 4) == 'S')
                    res++;
            }
        }
        System.out.print(res);
    }
}