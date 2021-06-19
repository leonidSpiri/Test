package Task17;

public class Fipi1 {
    public static void main(String[] args) {
        int kolvo = 0, min = Integer.MAX_VALUE;
        for (int i = 16015; i <= 48989; i++) {
            if ((i % 7 == 0 || i % 11 == 0) && i % 9 != 0 && i % 12 != 0 && i % 13 != 0) {
                kolvo++;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", kolvo, min); //5598 16023
    }
}
