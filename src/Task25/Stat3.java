package Task25;

public class Stat3 {
    public static void main(String[] args) {
        for (int i = 101000000; i <= 102000000; i++) {
            int del = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (j % 2 == 0) del++;
                    int vtorDel = i / j;
                    if (vtorDel % 2 == 0 && j != vtorDel) del++;
                }
            }
            if (del == 3) System.out.println(i);
        }
    }
}
/*101075762
101417282
101588258
101645282*/