package WHILE;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int kolvo = 0, all = 0;
        while (kolvo < 20000) {
            int x = rnd.nextInt(500);
            int y = rnd.nextInt(500);
            if (x >= 200 && x <= 400 && y >= 200 && y <= 400) {
                kolvo++;
                System.out.printf("\u001B[31m" + "The coordinates of the points x = %d, y = %d\n", x, y);
            } else {
                System.out.printf("\u001B[30m" + "The coordinates of the points x = %d, y = %d\n", x, y);
            }
            all++;
        }
        System.out.println("\u001B[30m" + "Total number " + all);
    }
}
