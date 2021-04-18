package Task6;

public class polkov1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000  ; i++) {
            int s = i, n = 1;
            while (s < 208) {
                s = s + 20;
                n = n * 2;
            }
            if (n == 256) System.out.println(i); //252
        }

    }
}
