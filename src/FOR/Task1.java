package FOR;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), res = n;
        for (int i = 1; i < n; i++) {
            res*=i;
        }
        System.out.println(res);

    }
}
