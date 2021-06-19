package Task6;

public class Stat4 {
    public static void main(String[] args) {

        for (int i = 1000; i > -1000; i--) {
            int s = i, n = 1;
            s = (10 * s) + 5;
            while (s < 2021) {
                s = s + 2 * n;
                n++;
            }
            if (n == 11) System.out.println(i); //191
        }
    }
}
