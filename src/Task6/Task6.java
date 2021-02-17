package Task6;

public class Task6 {
    public static void main(String[] args) {
        for (int d = 1; d < 1000; d++) {
            int n = 2, s = d;
            while (s < 500) {
                s += 20;
                n += 5;
            }
            if (n == 57) System.out.println(d);
            //280
        }
    }
}
