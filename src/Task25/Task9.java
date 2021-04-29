package Task25;

public class Task9 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 2; i < 20001; i++) {
            if (!isprosote(i)) {
                int del = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) if (isprosote(j)) del++;
                }
                if (del > 3) result++;
            }


        }
        System.out.println(result); //2362
    }


    static boolean isprosote(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
