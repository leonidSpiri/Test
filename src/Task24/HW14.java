package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*14)	Текстовый файл d24_14.txt содержит только заглавные буквы латинского алфавита (ABC…Z).
 Определите символ, который чаще всего встречается в файле между буквами X и Z, так что X стоит слева от него, а Z – справа.
  В ответе запишите сначала этот символ, а потом сразу (без разделителя) сколько раз он встретился между буквами X и Z.
Например, в тексте XBZCXXZXBZXDZDD между буквами X и Z два раза стоит B, по одному разу – X и D. Для этого текста ответом будет B2.*/
public class HW14 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/d24_14.txt"));
        String s = in.nextLine();
        int res = 0, now  = 0;
        String bukva = "";
        char buff = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'X' && s.charAt(i + 2) == 'Z') {
               now++;
            }
        }
        System.out.print(res);
    }
}
