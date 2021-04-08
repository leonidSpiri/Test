package Task15;

public class ege4 {
    public static void main(String[] args) {
        for (int a = 1; a < 100000; a++) {
            boolean istrue = true;
            for (int x = 0; x < 100000; x++) {
                boolean buff = (x % a == 0) || (x % 54 != 0) || (162 % x != 0);
                if (!buff) {
                    istrue = false;
                    break;
                }
            }
            if (istrue) System.out.println(a); //54
        }
    }
}
