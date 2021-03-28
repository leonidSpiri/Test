package Task6;

public class ege4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int s = i, n = 2;
            while (s / n > 0) {
                s -= 6;
                n += 3;
            }
            if (n == 17) System.out.println(i);
        }

    }
}
