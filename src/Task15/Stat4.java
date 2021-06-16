package Task15;

public class Stat4 {
    public static void main(String[] args) {
        for (int a = 100; a > 0; a--) {
            boolean flag = true;
            for (int x = 1; x < 10000; x++) {
                boolean buff = (a % 45 == 0) && ((750 % x != 0) || ((a % x != 0) || (120 % x == 0)));
                if (!buff) {
                    flag = false;
                    break;
                }

            }
            if (flag) System.out.println(a); //90 - 45
        }
    }
}
