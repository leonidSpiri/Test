package Task15;

public class Polkov1 {
    //(ДЕЛ(x, A) ∧ ДЕЛ(x, 24) ∧ ¬ДЕЛ(x, 16)) → ¬ДЕЛ(x, A)
    public static void main(String[] args) {
        for (int a = 100; a > 0; a--) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    boolean buff = !((x%a == 0) && (x%24 == 0) && (x%16 != 0)) || (x%a != 0);

                    if (!buff) {
                        flag = false;

                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //25
        }
    }
}
