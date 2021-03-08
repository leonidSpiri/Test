package Task22;

public class HW13 {
    public static void main(String[] args) {
        for (int xx = 1; xx < 10000; xx++) {
            for (int yy = 1; yy < 10000; yy++) {
                int x = xx, y = yy, a = 0, b = 0;
                while (x * y > 0) {
                    if (x > 0) a++;
                    if (y > 0 && y % 7 > b) b = y % 7;
                    x /= 10;
                    y /= 7;
                }
                if (a == 4 && b == 5) System.out.printf("x = %d, y = %d\n", xx, yy);
            }
        }
    }
}
