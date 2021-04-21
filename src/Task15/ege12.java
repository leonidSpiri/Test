package Task15;

public class ege12 {
    public static void main(String[] args) {
        for (int a = 100; a > 0; a--) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    boolean buff = (y + 2 * x > 27) || (y - x > 3) || (y <= a);

                    if (!buff) {
                        flag = false;

                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //11
        }
    }
}
