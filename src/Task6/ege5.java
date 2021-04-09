package Task6;

public class ege5 {
    public static void main(String[] args) {
        for (int i = 100000; i > 0; i--) {
            int n = i, s = 522;
            while (s - n > 0) {
                s -= 20;
                n -= 15;
            }
            if (s == 22) System.out.println(i); //397
        }

    }
}
