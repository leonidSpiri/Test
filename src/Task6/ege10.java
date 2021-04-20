package Task6;
public class ege10{
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int s = i, n = 0;
            while (s > 0) {
                s -= 40;
                n += 4;
            }
            if (n == 36) System.out.println(i); //320
        }

    }
}
