package Task6;

public class ege3 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000; i++) {
            int s = i, n = 2;
            while (s / n > 0) {
                s -= 5;
                n += 2;
            }
            if (n == 12) System.out.println(i);
        }
    }
}
