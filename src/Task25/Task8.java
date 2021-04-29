package Task25;

public class Task8 {
    public static void main(String[] args) {
        int chet = 1;
        for (int i = 2943444; i < 2943530; i++) {
            if (isprosote(i)) {
                System.out.println(chet + " " + i);
                chet++;
            }
        }
    }
/*1 2943467
2 2943491
3 2943503
4 2943527*/

    static boolean isprosote(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
