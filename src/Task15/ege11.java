package Task15;

public class ege11 {
    public static void main(String[] args) {
        for (int a = 100; a > 0; a--) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    boolean buff = (y + 5 * x > 34) || (y - x > 4) || (y <= a);

                    if (!buff) {
                        flag = false;

                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //9
        }
    }
}
