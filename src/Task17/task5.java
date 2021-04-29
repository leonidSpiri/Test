package Task17;

public class task5 {
    public static void main(String[] args) {
        int max = 0, kolvo = 0;
        for (int i = 3466; i < 9082; i++) {
            int ii = i;
            String eight = "";
            while (ii > 0) {
                eight += ii % 8;
                ii /= 8;
            }
            String ten = String.valueOf(i);
            if ((i % 7 == 1 || i % 7 == 5) && eight.length() != ten.length()) {
                max = Math.max(max, i);
                kolvo++;
            }
        }
        System.out.printf("%d %d", kolvo, max); //1425 9080
    }
}
