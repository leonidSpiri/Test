package Task15;

public class stat1 {
    public static void main(String[] args) {
        for (int a = 1; a < 50; a++) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    boolean buff = (x % a == 0) || ((x % 10 != 0) || (x % 12 != 0));

                    if (!buff) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //30
        }
    }
}