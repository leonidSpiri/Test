package Task27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stat4 {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner in = new Scanner(new File("Texts/stat4-27-B.txt"));
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length-2; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                for (int k = j+1; k < array.length; k++) {
                    int one = array[i], two = array[j], three = array[k];
                    if ((one+two+three)%3 == 0) max = Math.max(max, (one+two+three));
                }
            }
        }
        System.out.println(max);
    }//2697
}
