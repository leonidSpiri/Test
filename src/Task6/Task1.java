package Task6;

public class Task1 {
    public static void main(String[] args) {
        for (int d = 1; d < 366; d++) {
            int n = 0, s = 0;
            while (s < 366) {
                s += d;
                n += 5;
            }
            if (n == 55) System.out.println(d);
            //36
        }
    }
}
