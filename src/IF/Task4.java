package IF;

import java.util.Scanner;

/*В обращении имеются 1, 2, 5, 10,  20, 50 рублевых монет.
Написать программу, опре-деляющую сдачу наименьшим количеством монет.
Для определения размера сдавае-мой сдачи сначала определить,
сколько требуется для этого монет 50-рублевого досто-инства,
затем 20, 10, 5, 2, 1, пока необходимая сумма не будет набрана*/
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
