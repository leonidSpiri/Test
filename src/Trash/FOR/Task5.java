package Trash.FOR;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            if (n % i == 0) System.out.print(n / i + " ");
        }
    }
}
