package Task17;

public class task10 {
    public static void main(String[] args) {
        int max = 0, kolvo = 0;
        for (int i = 2020; i < 647039; i++) {
            boolean isbad = false;
            int min = 10;
            int count = 0;
            String ii = String.valueOf(i);
            for (int j = 0; j < ii.length(); j++) {
                count += Integer.parseInt(String.valueOf(ii.charAt(j)));
                min = Math.min(min, Integer.parseInt(String.valueOf(ii.charAt(j))));
            }
            if (count < 10) {
                for (int j = 0; j < 3; j++) {
                    if (Integer.parseInt(String.valueOf(ii.charAt(j))) == min) isbad = true;
                }


                if (!isbad) {
                    kolvo++;
                }
            }
        }
        System.out.printf("%d %d", kolvo, max); //16734 29874
    }
}
