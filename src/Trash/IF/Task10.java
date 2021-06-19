package Trash.IF;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String xod = in.next().toUpperCase();
        int x = 0, y = 0, counter = 0;
        while (!xod.equals("К")) {
            switch (xod) {
                case "С" -> x++;
                case "Ю" -> x--;
                case "З" -> y--;
                case "В" -> y++;
            }
            counter++;
            xod = in.next().toUpperCase();
        }
        System.out.printf("x = %d, y = %d", x, y);
        x = Math.abs(x);
        y = Math.abs(y);
        System.out.println();
        x += y;
        if (x < counter) System.out.println("Можно пройти данный маршрут за " + x);
        else System.out.println("Вы выбрали самый короткий маршрут");
    }
}
