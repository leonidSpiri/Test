package Task22;

public class HW11 {
    public static void main(String[] args) {
        int count = 0;
        for (int d = 0; d < 10000; d++) {
            int n = d, i = 0;
            while (n > 0) {
                i += n % 9;
                n /= 9;
            }
            if (i % 8 != 0 && d < 100 && d > 9) {
                System.out.printf("d = %d, i = %d\n", d, i);
                count++;
            }
        }
        System.out.println("\n\n count = " + count);
        // count = 79
    }
}
