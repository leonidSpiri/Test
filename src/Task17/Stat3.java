package Task17;

public class Stat3 {
    public static void main(String[] args) {
        int kolvo = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 10001; i <= 50000; i++) {
            int del = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) del++;
            }
            if (del > 17) {
                kolvo++;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", kolvo, min); //6585 10008
    }
}
