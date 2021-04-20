package Task17;

public class ege11 {
    public static void main(String[] args) {
        int kolvo = 0, max = 0;
        for (int i = 2050; i < 80393; i++) {
            if ((i % 10 == 2 || i % 10 == 7) && i % 3 == 0 && i % 7 == 0 && i % 11 == 0) {
                kolvo++;
                max = i;
            }
        }
        System.out.printf("%d %d", kolvo, max); //68 80157
    }
}
