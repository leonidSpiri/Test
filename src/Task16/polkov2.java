package Task16;

public class polkov2 {
    public static void main(String[] args) {
        int otvet = 0;
        for (int n = 1; n < 801; n++) {
            int result = F(n);
            boolean istrue = true;
            while (result > 0) {
                if ((result % 10) % 2 != 0) {
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
        if (n <= 18) return n + 3;
        if (n % 3 == 0) return (n / 3) * F(n / 3) + n - 12;
        return F(n - 1) + n * n + 5;
    }
}
