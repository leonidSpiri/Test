package Trash.IF;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int buff = 0;

        if (a1 > a2) {
            buff = a2;
            a2 = a1;
            a1 = buff;
        }
        if (b1 > b2) {
            buff = b2;
            b2 = b1;
            b1 = buff;
        }

        if ((a1 < b1) && (a2 < b2) || (b1 < a1) && (b2 < a2))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
