package Task17;

public class ege13 {
    public static void main(String[] args) {
        int kolvo = 0, max = 0;
        for (int i = 1047; i < 7017; i++) {
            if ((i / 10) % 10 == 0 && (i % 11 == 0 || i % 14 == 0 || i % 26 == 0)) {
                kolvo++;
                max = i;
            }
        }
        System.out.printf("%d %d", kolvo, max); //115 7007
    }
}
