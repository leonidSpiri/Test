package Task25;

public class ege16 {
    public static void main(String[] args) {
        int chislo = 650001, n = 0;
        while (n != 5) {
            int s = 0;
            for (int i = 2; i <= chislo / 2; i++) {
                if (chislo % i == 0) {
                    if (isgood(i)) s += i;
                }

            }
            if (s % 11 == 0 && s!=0) {
                System.out.println(chislo + " " + s);
                n++;

            }
            chislo++;
        }
    }

    static boolean isgood(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
