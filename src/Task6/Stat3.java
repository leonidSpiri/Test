package Task6;

public class Stat3 {
    public static void main(String[] args) {

        for (int i = 1000; i > -1000; i--) {
            int s = i, n = 36;
            s = (s+1) / 7;
            while (s < 2050) {
                s *= 2;
                n += 3;
            }
            if (n == 60) System.out.println(i); //62
        }
    }
}
