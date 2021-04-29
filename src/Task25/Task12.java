package Task25;

public class Task12 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 2; i < 20001; i++) {
            int s = 0;
            for (int j = 1; j <= i / 2; j++) if (i % j == 0) s += j;
            if (i < s) result++;
        }
        System.out.println(result); //4953
    }
}