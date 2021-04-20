package Task15;

public class ege10 {
    public static void main(String[] args) {
        for (int a = 100; a >0; a--) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    boolean buff = (2*x+y < a) || (x<y) || (21<=x);

                    if (!buff) {
                        flag = false;

                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //61
        }
    }
}
