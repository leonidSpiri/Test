package Task6;

public class Task5 {
    public static void main(String[] args) {
        for (int d = 1; d < 1000; d++) {
            int n = 0, s = d;
            while (s < 205) {
                s += 10;
                n++;
            }
            if (n == 12) System.out.println(d);
            //94
        }
    }
}
