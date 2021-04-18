package Task6;

public class ege9 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int s = i, n = 0;
            while (s > 0) {
                s -= 20;
                n += 3;
            }
            if (n == 48) System.out.println(i); //320
        }

    }
}
