package Task25;

public class Task6 {

    public static void main(String[] args) {
        int result = 0;
        String otvet = "";
        for (int i = 268220; i < 270336; i++) {
            int kolvo = 0, sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    kolvo++;
                    sum += j;
                }
            }

            if (sum > result && kolvo < 5) {
                otvet = sum + " " + kolvo;
                for (int j = i / 2; j >= 1; j--) {
                    if (i % j == 0) {
                        otvet += " " + j;
                    }
                }
                result = sum;
            }
        }
        System.out.println(otvet);
    }
}
