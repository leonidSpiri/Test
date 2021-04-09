package Task15;

public class ege5 {
    public static void main(String[] args) {
        for (int a = 0; a < 100000; a++) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    boolean buff = (x >= a) || (y >= a) || (x * y <= 200);

                    if (!buff) {
                        flag = false;

                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //15
        }
    }
}
