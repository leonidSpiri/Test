package Task22;

public class HW7 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int x = i, a = 0, b = 1;
            while (x > 0) {
                a++;
                if (x % 12 != 0) b *= x % 12;
                x /= 12;
            }
            if (a == 2 && b == 10) System.out.printf("i = %d, x = %d\n", i, x);
        }
        //всего 5 чисел
    }
}
