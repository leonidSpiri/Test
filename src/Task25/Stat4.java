package Task25;

public class Stat4 {
    public static void main(String[] args) {
        for (int i = 35_000_000; i <= 40_000_000; i++) {
            int del = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (j % 2 == 1) del++;
                    int vtorDel = i / j;
                    if (vtorDel % 2 == 1 && j != vtorDel)
                        del++;
                    if (del > 5) break;
                }
            }
            if (del == 5) System.out.println(i);
        }
    }
}
/*35819648
38950081
39037448
39337984
*/