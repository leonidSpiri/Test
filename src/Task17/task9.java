package Task17;

public class task9 {
    public static void main(String[] args) {
        int max = 0, kolvo = 0;
        for (int i = 5903; i < 174204; i++) {
            boolean isalreadyhas = true;
            int big = 0;
            String ii = String.valueOf(i), has = "";
            for (int j = 0; j < ii.length(); j++)
                if (has.contains(String.valueOf(ii.charAt(j)))) {
                    isalreadyhas = false;
                    break;
                } else {
                    has += String.valueOf(ii.charAt(j));
                    if (Integer.parseInt(String.valueOf(ii.charAt(j))) > 4) big++;
                }

            if (isalreadyhas && big == 3) {
                kolvo++;
                if (i < 30000) max = Math.max(max, i);

            }
        }
        System.out.printf("%d %d", kolvo, max); //16734 29874
    }
}
