package Trash.IF;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (b == c && a == c) System.out.println("Треугольгик равносторонний");
        else if (a == b || b == c || a == c) System.out.println("Треугольгик равнобедренный");
        else System.out.println("Треугольник разносторонний");
    }
}
