package Task15;

public class polkov2 {
    public static void main(String[] args) {
        for (int a = 100; a > 0; a--) {
            boolean flag = true;
            for (int x = 0; x < 10000; x++) {
                for (int y = 0; y < 10000; y++) {
                    //(ДЕЛ(x, 45) ∧ ¬ДЕЛ(x, 15)) → ¬ДЕЛ(x, A)
                    boolean buff = !((x % 45 == 0) && (x % 15 != 0)) || (x % a != 0);

                    if (!buff) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) System.out.println(a); //1
        }
    }
}
