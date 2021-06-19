package Trash.FOR;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), N = in.nextInt(), M = in.nextInt();
        for (int i = A; i < B + 1; i++) {
            if (i % N == M) System.out.println(i);
        }
    }
}
