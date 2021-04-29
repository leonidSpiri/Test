package Task17;

public class Polkov1 {
    public static void main(String[] args) {
        int kolvo = 0, max = 0;
        for (int i = 1016; i < 7938; i++) {
            if (i % 3 == 0 && i % 7 != 0 && i % 17!= 0 && i % 19 != 0 && i % 27 != 0) {
                kolvo++;
                max = i;
            }
        }
        System.out.printf("%d %d", kolvo, max); //1568 7935
    }
}
