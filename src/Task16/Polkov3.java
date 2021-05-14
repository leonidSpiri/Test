package Task16;

public class Polkov3 {
    public static void main(String[] args) {
        int otvet = 0;
        for (int n = 1; n < 1001; n++) {
            int result = F(n);
            boolean istrue = true;
            while (result > 0) {
                if ((result % 10) % 2 == 0) {
                    istrue = false;
                    break;
                }
                result /= 10;
            }
            if (istrue) otvet++;
        }
        System.out.println(otvet);
    }

    static int F(int n) {
        if (n <= 13) return n * n * n + n * n + 1;
        if (n % 3 == 0) return F(n - 1) + 2 * n * n - 3;
        return F(n - 2) + 3 * n + 6;
    }

}
