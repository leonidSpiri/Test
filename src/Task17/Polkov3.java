package Task17;

public class Polkov3 {
    public static void main(String[] args) {
        int kolvo = 0, max = 0;
        for (int i = 1012; i < 9639; i++) {
            if (i % 3 == 0 && i % 11 != 0 && i % 17 != 0 && i % 13 != 0 && i % 19 != 0) {
                kolvo++;
                max = i;
            }
        }
        System.out.printf("%d %d", kolvo, max); //2151 9630
    }
}
