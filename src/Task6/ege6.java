package Task6;

public class ege6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int s = i, n = 300;
            while (s - n > 0) {
                s -= 25;
                n -= 10;
            }
            if (s == 150) System.out.println(i); //525
        }

    }
}
