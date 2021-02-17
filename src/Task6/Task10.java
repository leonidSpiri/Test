package Task6;

public class Task10 {
    public static void main(String[] args) {
        for (int d = 1000; d > 0; d--) {
            int n = 200, s = d;
            while (s / n >= 2) {
                s += 5;
                n += 5;
            }
            if (s > 99 && s < 1000) {
                System.out.println(d);
                break;
            }
            //699
        }
    }

}
