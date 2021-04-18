package Task17;

public class ege9 {
    public static void main(String[] args) {
        int kolvo = 0, max = 0;
        for (int i = 2077; i < 80393; i++) {
            if (i % 10 != 6 && i % 3 == 0 && i % 6 == 0 && i % 19 == 0 && i % 29 == 0) {
                kolvo++;
                max = i;
            }
        }
        System.out.printf("%d %d", kolvo, max); //19 79344
    }
}
