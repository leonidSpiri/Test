package Task15;

public class Task2 {
    public static void main(String[] args) {
        for (int a = 1000; a > 0; a--) {
            boolean flag = true;
            for (int x = 0; x < 1000; x++) {
                for (int y = 0; y < 1000; y++) {
                    boolean buff = ((x >= 3) || (x * x <= a)) && ((y * y >= a) || (y < 15));
                    if (!buff) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //4
        }
    }
}
