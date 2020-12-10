package LOOPS;

public class Task1 {
    public static void main(String[] args) {
        //Are you kidding me?))
        //Or a don't understand the task?
        // ok. let's do it

        int[] arrThousand =new int[1000];
        for (int i = 0; i < arrThousand.length-1; i++) {
            arrThousand[arrThousand.length-i-1] = i;
        }
        for (int i = 0; i < arrThousand.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
