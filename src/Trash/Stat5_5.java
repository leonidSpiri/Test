package Trash;

public class Stat5_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int x = i;
            if (x % 2 == 0) x /= 2;
            else x--;

            if (x % 3 == 0) x /= 3;
            else x--;

            if (x % 5 == 0) x /= 5;
            else x--;

            if (x == 1) System.out.println(i);
        }
    }
}
