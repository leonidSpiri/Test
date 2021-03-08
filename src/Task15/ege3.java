package Task15;

public class ege3 {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            boolean flag = true;
            for (int x = 1; x < 10000; x++) {
                boolean buff = (x % a == 0) || (x % 24 != 0) || (96 % x != 0);
                if (!buff) flag = false;
            }
            if (flag) System.out.println(a);
        }
    }
}
