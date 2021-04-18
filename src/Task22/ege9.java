package Task22;

public class ege9 {
    public static void main(String[] args) {
        for (int v = 0; v < 10000000; v++) {
            int x = v, l = 1, m =0;
            while (x>0) {
                m++;
                if (x%8>3){
                    l=l*(x&8);
                }
                x/=8;
            }

            if (l == 120 && m == 4) System.out.println(v); //83
        }
    }
}
