package Trash.WHILE;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        String chislo = String.valueOf(rnd.nextInt(999999 - 111111) + 111111);
        System.out.println(chislo);
        int one = chislo.charAt(0)
                + chislo.charAt(1)
                + chislo.charAt(2);

        int two = chislo.charAt(3)
                + chislo.charAt(4)
                + chislo.charAt(5);

        if (one == two) System.out.println("lucky");
        else System.out.println("unlucky");
    }
}
