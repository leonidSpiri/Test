package Task6;

public class Task2 {
    public static void main(String[] args) {
        for (int d = 1; d < 1978; d++) {
            int n = 23, s = 18;
            while (s < 1978) {
                s += d;
                n += 6;
            }
            if (n == 53) System.out.println(d);
            //392,489
        }
    }
}
