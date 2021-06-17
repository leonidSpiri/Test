package Task17;

public class Stat4 {
    public static void main(String[] args) {
        int kolvo = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 10001; i <= 50000; i++) {
            int del = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0 && isgood(j)) del++;
                if (del > 3) break;
            }

            if (del == 3) {
                kolvo++;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", kolvo, min); //15652 10002
    }

    static boolean isgood(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
