package Task16;

public class HW9 {
    public static void main(String[] args) {
        int howMany = 0;
        for (int i = 1; i < 801; i++) {
            int result = F(i);
            String resStr = String.valueOf(result);
            boolean ischet = true;
            for (int j = 0; j < resStr.length(); j++) {
                if ((int) resStr.charAt(j) % 2 != 0) ischet = false;
            }
            if (ischet) howMany++;
        }
        System.out.println(howMany);
        //16
    }

    static int F(int n) {
        if (n <= 18) return n + 3;
        if (n > 18 && n % 3 == 0) return (n / 3) * F(n / 3) + n - 12;
        if (n > 18 && n % 3 != 0) return F(n - 1) + n * n + 5;
        return 0;
    }
}
