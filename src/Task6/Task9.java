package Task6;

public class Task9 {
    public static void main(String[] args) {
        for (int d = 1; d < 1000; d++) {
            int n = 400, s = d;
            while (s - n > 0) {
                s -= 20;
                n -= 15;
            }
            if (s < 0) {
                System.out.println(d);
                break;
            }
            //531
        }
    }
}
