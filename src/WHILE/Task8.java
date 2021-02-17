package WHILE;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt(), buff = b;
        while (a != buff) {
            a++;
            b--;
            //buff = b;
            System.out.println(a + " " + b);
        }
    }
}
