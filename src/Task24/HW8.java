package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_8.txt"));
        String s = in.nextLine();
        int now = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < now) {
                if (s.charAt(i) % 2 == 0) now = s.charAt(i);
            }

        }
        System.out.println((char) now);
    }
}
