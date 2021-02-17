package Task6;

public class Task7 {
    public static void main(String[] args) {
        for (int d = 1; d < 1000; d++) {
            int n = 5, s = d;
            while (s > 5) {
                s /= 2;
                n += 4;
            }
            if (n == 29) System.out.println(d);
            //383
        }
    }
}
