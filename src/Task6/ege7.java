package Task6;

public class ege7 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int s = 127, n = i;
            while (n - s > 0) {
                s += 20;
                n += 15;
            }
            if (s == 627) System.out.println(i); //252
        }

    }
}
