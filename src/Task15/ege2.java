package Task15;

public class ege2 {
    public static void main(String[] args) {
        for (int a = 1; a < 10000; a++) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                boolean buff = (x % a == 0) || ((x % 26 != 0) || (x % 169 != 0));
                if (!buff) flag = false;
            }
            if (flag) System.out.println(a);
        }
    }
}
