package Trash.IF;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int boy = in.nextInt();
        int girl = in.nextInt();
        int balloon = in.nextInt();
        boy /= 2;
        int max = boy;
        if (girl < max) max = girl;
        balloon /= 3;
        if (balloon < max) max = balloon;
        System.out.println("Максимальное количество команд: " + max);
    }
}
