package Trash.WHILE;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            if (in.next().equals("STOP")) n--;
        }
    }
}
