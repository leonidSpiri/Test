package Task16;

public class Task6 {
    public static void main(String[] args) {
        int otvet = 0;
        for (int i = 1; i < 1001; i++) {
            int n = F(i);
            String res = String.valueOf(n);
            int howMany = 0;
            for (int j = 0; j < res.length(); j++) if (res.charAt(j) == '8') howMany++;
            if (howMany > 1) otvet++;
        }
        System.out.println(otvet);
    }

    static int F(int n) {
        if (n <= 5) return n + 15;
        if (n > 5 && n % 2 == 0) return F(n / 2) + n * n * n - 1;
        if (n > 5 && n % 2 != 0) return F(n - 1) + 2 * n * n + 1;
        return 0;
    }
}
