package Task6;

public class ege16 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            int s = i, n = 0;
            while (s <= 45) {
                s += 4;
                n += 11;
            }
            if (n == 132) System.out.println(i); //1
        }

    }
}
