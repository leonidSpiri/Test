package Task15;

public class Stat5 {
    public static void main(String[] args) {
        for (int a = 100; a > 0; a--) {
            boolean flag = true;
            for (int x = 1; x < 10000; x++) {
                boolean buff = ((x & 73) != 0) || (((x & 28) == 0) || ((x & a) != 0));
                if (!buff) {
                    flag = false;
                    break;
                }

            }
            if (flag) System.out.println(a); //20
        }
    }
}
