package Task17;

public class stat1 {
    public static void main(String[] args) {
        int kolvo = 0;
        long min = (long) (4 * Math.pow(10, 10));
        for (long i = (long) (2 * Math.pow(10, 10)); i <= (4 * Math.pow(10, 10)); i++) {
            if (i % 7 == 0 && i % 100000 == 0 && i % 13 != 0 && i % 29 != 0 && i % 43 != 0 && i % 101 != 0) {
                kolvo++;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", kolvo, min); //24626 20000400000
    }
}
