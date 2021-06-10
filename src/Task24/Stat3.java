package Task24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stat3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/stat3_24.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String s = in.next();
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i - 1) == s.charAt(i + 1)) {
                String buff = String.valueOf(s.charAt(i));
                arrayList.add(buff);
            }
        }
        Collections.sort(arrayList);
        int a = 0, max = 0;
        String buff = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(buff)) a++;
            else {
                System.out.println(buff + " = " + a);
                buff = arrayList.get(i);
                max = Math.max(max, a);
                a = 0;
            }
        }
        System.out.println(max);//D
    }
}
