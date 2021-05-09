package Task15;

public class Task1 {
    public static void main(String[] args) {
        for (int a = 1; a < 100; a++) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                boolean buff = (a < 50) && ((x % a != 0) || ((x % 10 != 0) || (x % 12 == 0)));
                if (!buff) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(a);
        }
    }
}
