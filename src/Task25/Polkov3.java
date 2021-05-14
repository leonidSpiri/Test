package Task25;

public class Polkov3 {
    public static void main(String[] args) {
        for (int i = 194455; i < 194501; i++) {
            int kolvo = 0, del = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    kolvo++;
                    del = j;
                }
            }
            if (kolvo == 3) System.out.println(del + " " + i);
        }
    }


}
