package Task17;

public class task3 {
    public static void main(String[] args) {
        int max = 0, min = 10000;
        for (int i = 1000; i < 10000; i++) {
            int ii = i;
            String onv = "";
            while (ii > 0) {
                onv += ii % 4;
                ii /= 4;
            }
            if (i % 3 != 0 && i % 17 != 0 && i % 19 != 0 && onv.length() == 6) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", min, max); //1024 4094
    }
}
