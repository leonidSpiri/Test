package Trash.WHILE;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean u = false, r = false, a = false;
        while (!u || !r || !a) {
            String vvod = in.next().toUpperCase();
            switch (vvod) {
                case "U":
                    u = true;
                    break;
                case "R":
                    r = true;
                    break;
                case "A":
                    a = true;
                    break;

            }
        }
    }
}
