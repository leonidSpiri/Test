package Task6;

public class Fipi1 {
    public static void main(String[] args) {
        for (int d = 100000; d > 1; d--) {
            int s = d, n = 1;
            while (s < 47) {
                s += 4;
                n *= 2;
            }
            if (n == 64)
                System.out.println(d);
        }

    }
}
