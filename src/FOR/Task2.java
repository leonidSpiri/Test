package FOR;


public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
    }
}
