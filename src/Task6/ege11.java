package Task6;

public class ege11 {
    public static void main(String[] args) {
        for (int i = -10000; i < 100000; i++) {
            int s = i, n = 0;
            while (s <= 55) {
                s += 5;
                n += 2;
            }
            if (n == 24) System.out.println(i); //0
        }

    }
}
