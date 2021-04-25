package Task17;

public class Polkov2 {
    public static void main(String[] args) {
        int kolvo = 0, max = 0;
        for (int i = 1033; i < 7738; i++) {
            if (i % 5 == 0 && i % 11 != 0 && i % 17 != 0 && i % 19 != 0 && i % 23 != 0) {
                kolvo++;
                max = i;
            }
        }
        System.out.printf("%d %d", kolvo, max); //1040 7730
    }
}
