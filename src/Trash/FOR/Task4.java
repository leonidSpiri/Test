package Trash.FOR;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int chetMax = 0, nechetMin = Integer.MAX_VALUE, chetKolvo = 0, nechetKolvo = 0;
        for (int i = 0; i < 20; i++) {
            int number = new Random().nextInt(20);
            if (number % 2 == 0) {
                chetKolvo++;
                if (number > chetMax) chetMax = number;
            } else {
                nechetKolvo++;
                if (number < nechetMin) nechetMin = number;
            }
        }
        System.out.printf("Максимальное четное число = %d\n" +
                "Минимальное нечетное число = %d\n", chetMax, nechetMin);

        if (chetKolvo > nechetKolvo) {
            chetKolvo -= nechetKolvo;
            System.out.println("Четных чисел больше на " + chetKolvo);
        } else if (chetKolvo < nechetKolvo) {
            nechetKolvo -= chetKolvo;
            System.out.println("Нечетных чисел больше на " + nechetKolvo);
        } else System.out.println("Чисел одинаковое количество");

    }
}
