package IF;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        int a5 = in.nextInt();

        if (a1 > a2 && a2 > a3 && a3 > a4 && a4 > a5) {
            System.out.println("Убывание");
        } else if (a1 < a2 && a2 < a3 && a3 < a4 && a4 < a5) {
            System.out.println("Возрастание");
        } else
            System.out.println("Хаос");
    }
}
