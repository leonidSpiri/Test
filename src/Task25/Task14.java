package Task25;

public class Task14 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 523456; i < 578926; i++) {
            if (isgood(i)) System.out.println(i);
        }
    }

    static boolean isgood(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
