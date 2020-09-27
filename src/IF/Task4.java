package IF;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] sdacha = new int[]{50, 20, 10, 5, 2, 1};
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt(), steck = 0;
        while (sum != 0) {
            if (sum - sdacha[steck] >= 0) {
                sum -= sdacha[steck];
                System.out.print(sdacha[steck] + " ");
            } else steck++;
        }

    }
}
