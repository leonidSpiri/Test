package Task17;

public class task2 {
    public static void main(String[] args) {
        int kolvo = 0, min = 10000;
        for (int i = 1000; i < 10000; i++) {
            int ii = i;
            String five = "";
            while (ii > 0) {
                five += ii % 5;
                ii /= 5;
            }
            if (five.length() > 5 && (i % 25 == 21 || i % 25 == 23)) {
                kolvo++;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", kolvo, min); //550 3146
    }
}
