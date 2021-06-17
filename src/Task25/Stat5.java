package Task25;

public class Stat5 {
    public static void main(String[] args) {
        for (int i = 200_000_000; i <= 400_000_000; i++) {
            int del = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (j % 2 == 1) del++;
                    int vtorDel = i / j;
                    if (vtorDel % 2 == 1 && j != vtorDel)
                        del++;
                }
            }
            if (del == 5) System.out.println(i);
        }
    }
}
