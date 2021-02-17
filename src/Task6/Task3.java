package Task6;

public class Task3 {
    public static void main(String[] args) {
        for (int d = 1; d < 300; d++) {
            int n = 34, s = d;
            while (n < 171) {
                s += 120;
                n += 23;
            }
            if (s == 1000) System.out.println(d);
            //280
        }
    }
}
