package Task6;

public class Task8 {
    public static void main(String[] args) {
        for (int d = 1; d < 1000; d++) {
            int n = 10, s = d;
            while (s > n + 20) {
                s -= 6;
                n += 11;
            }
            if (n == 450) {
                System.out.println(d);
                break;
            }
            //694
        }
    }
}
