package Trash.IF;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int x3 = in.nextInt();
        int y3 = in.nextInt();

        int x4 = 0;
        int y4 = 0;

        if (x1 != x2 && x1 != x3) x4 = x1;
        else if (x2 != x1) x4 = x2;
        else x4 = x3;

        if (y1 != y2 && y1 != y3) y4 = y1;
        else if (y2 != y1) y4 = y2;
        else y4 = y3;

        System.out.printf("x = %d, y= %d", x4, y4);
    }
}
