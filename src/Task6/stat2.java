package Task6;

public class stat2 {
    public static void main(String[] args) {

        for (int i = 1000; i > -1000; i--) {
            int s = i, n = 36;

            while (s < 2020) {
                s *= 2;
                n += 3;
            }
            if (n == 60) System.out.println(i); //8
        }
    }
}
