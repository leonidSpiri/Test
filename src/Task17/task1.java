package Task17;

public class task1 {
    public static void main(String[] args) {
        int kolvo = 0, min = 10000;
        for (int i = 1529; i < 9483; i++) {
            if (i % 4 == 1 && i % 5 == 3) {
                kolvo += i;
                min = Math.min(min, i);
            }
        }
        System.out.printf("%d %d", min, kolvo); //1533 2190194
    }
}
