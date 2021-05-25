package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class stat1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/24.txt"));
        int res = 0;
        while (in.hasNext()) {
            String s = in.nextLine();
            int e = 0, a = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'E') e++;
                if (s.charAt(i) == 'A') a++;
            }
            if (e > a) res++;
        }
        System.out.println(res);//467
    }
}
