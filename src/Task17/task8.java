package Task17;

public class task8 {
    public static void main(String[] args) {
        int max = 0, kolvo = 0;
        for (int i = 2848; i < 109500; i++) {
            boolean isnine = false;
            String ii = String.valueOf(i);
            for (int j = 0; j < ii.length(); j++)
                if (ii.charAt(j) == '9') {
                    isnine = true;
                    break;
                }

            if (isnine) {
                int iii = i, sum = 0;
                while (iii > 0) {
                    int buff = iii % 10;
                    if (buff > 5) sum += buff;
                    iii /= 10;
                }
                if (sum % 3 == 0) {
                    kolvo++;
                    if (ii.charAt(0) == '8') max = Math.max(max, i);
                }

            }
        }
        System.out.printf("%d %d", kolvo, max); //20865 89997
    }
}
