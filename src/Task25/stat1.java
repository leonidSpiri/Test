package Task25;

public class stat1 {
    public static void main(String[] args) {
        for (int i = 123456789; i <= 223456789; i++) {
            int kolvo = 0, del = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    kolvo++;
                    del = j;
                }
            }
            if (kolvo == 3) System.out.println(del + " " + i);
        }
    }
}
