package Task6;

public class stat1 {
    public static void main(String[] args) {

        for (int i = 1000; i > -1000; i--) {
            int s = i, n = 4;

            while (s < 37) {
                s += 3;
                n *= 2;
            }
            if (n == 128) System.out.println(i); //22
        }
    }
}
