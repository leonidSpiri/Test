package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_5.txt"));
        String s = in.nextLine();
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String buff = "";
            buff += String.valueOf(s.charAt(i));
            if (!buff.contains(String.valueOf(s.charAt(i + 1)))) {
                buff += String.valueOf(s.charAt(i + 1));
                if (!buff.contains(String.valueOf(s.charAt(i + 2)))) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
