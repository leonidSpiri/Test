package WHILE;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int chislo = rnd.nextInt(11);
        int vvod = in.nextInt();
        while (vvod != chislo) {
            if (vvod > chislo) System.out.println("Smaller");
            else System.out.println("Bigger");
            vvod = in.nextInt();
        }
        System.out.println("You win!");
    }
}
