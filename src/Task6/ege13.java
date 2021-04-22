package Task6;

public class ege13 {
    public static void main(String[] args) {
        for (int i = 10000; i > -100000; i--) {
            int s = i, n = 0;
            while (s < 85) {
                s += 5;
                n += 8;
            }
            if (n == 128) System.out.println(i); //5
        }

    }
}
