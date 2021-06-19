package Trash.IF;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if ((Math.abs(x1 - x2) == 2 && (Math.abs(y1 - y2) == 1))
                || (Math.abs(x1 - x2) == 1 && (Math.abs(y2 - y1) == 2))) {
            System.out.println("можно пойти конём");
        } else if (x1 == x2 || y1 == y2) {
            System.out.println("можно пойти ладьёй");
        } else if (Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
            System.out.println("Можно пойти офицером");
        } else System.out.println("Никак вы не можете пойти");

    }
}
