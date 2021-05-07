package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_9.txt"));
        String s = in.nextLine();
        int now = 1, res = 0, index = 0, indexbuff = 0;
        char buff = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > buff) now++;
            else {
                if (now > res) {
                    res = now;
                    index = indexbuff;
                }
                now = 1;
                indexbuff = i + 1;
            }
            buff = s.charAt(i);
        }
        System.out.println(index);
    }
}
