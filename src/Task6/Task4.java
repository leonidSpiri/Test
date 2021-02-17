package Task6;

public class Task4 {
    public static void main(String[] args) {
        for (int d = 1; d < 1000; d++) {
            int n = 5, s = d;
            while (s < 110) {
                n++;
                s += n;
            }
            if (n == 15) System.out.println(d);
            //4
        }
    }
}
