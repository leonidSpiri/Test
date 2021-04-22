package Task17;

public class task4 {
    public static void main(String[] args) {
        int max = 0, kolvo = 0;
        for (int i = 2461; i < 9720; i++) {

            if ((i / 10) % 10 > 2 && (i / 10) % 10 < 8 && (i / 100) % 10 != 1 && (i / 100) % 10 != 9) {
                max = Math.max(max, i);
                kolvo++;
            }
        }
        System.out.printf("%d %d", kolvo, max); //2919 9679
    }
}
