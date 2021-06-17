package Task17;

public class Stat5 {
    public static void main(String[] args) {
        int kolvo = 0, min = Integer.MAX_VALUE;
        for (int i = 345678; i <= 456789; i++) {
            int sum = 0;
            int buff = i;
            while (buff > 0) {
                sum += buff % 10;
                buff /= 10;
            }
            if (i % sum == 0) {
                kolvo++;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", kolvo, min); // 10777 345681
    }
}
