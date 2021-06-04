package Trash;

public class Test {
    public static void main(String[] args) {
        for (int i = 123456789; i <= 223456789; i++) {
            int kolvo = 0, del = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0 && j*j ==i) {
                    kolvo++;
                    del = j;
                }
            }
            if (kolvo == 3) System.out.println(del + " " + i);
        }
    }
}
