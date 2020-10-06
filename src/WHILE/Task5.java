package WHILE;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt(), summ = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (chislo > 0) {
            int buff = chislo % 10;
            chislo /= 10;
            summ++;
            if (buff < min) min = buff;
            if (buff > max) max = buff;
        }
        System.out.println("Total is" + summ);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }
}
