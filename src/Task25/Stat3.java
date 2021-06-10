package Task25;

public class Stat3 {
    public static void main(String[] args) {
        for (int i = 101000000; i <= 102000000; i++) {
            int del = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0 && j % 2 == 0) {
                    del++;
                }
            }
            if ((i %2 ==0 && del == 2) || (i %2 !=0 && del == 3)) System.out.println(i);
        }
    }
}
//101075762
//    4/36