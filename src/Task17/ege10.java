package Task17;

public class ege10 {
    public static void main(String[] args) {
        int kolvo = 0, min = 0;
        for (int i = 70076; i >= 2004; i--) {
            if (i % 10 != 3 && i % 3 == 0 && i % 7 == 0 && i % 11 == 0 && i % 19 == 0) {
                kolvo++;
                min = i;
            }
        }
        System.out.printf("%d %d", kolvo, min); //14 4389
    }
}
