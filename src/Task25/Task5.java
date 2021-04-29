package Task25;

public class Task5 {
    public static void main(String[] args) {
        int chet = 1;
        for (int i = 194441; i < 196501; i++) {
            int kolvo = 0, square = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    kolvo++;
                    if (j * j == i) square = j;
                }
            }
            if (kolvo % 2 != 0) {
                System.out.println(chet + " " + i + " " + kolvo + " " + square);
                chet++;
            }
        }
    }

    /*1 194481 23 441
    2 195364 25 442
    3 196249 1 443*/
    static boolean isprosote(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
