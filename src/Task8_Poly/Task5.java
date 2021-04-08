package Task8_Poly;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        String slovo = "РАЗМАХ";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            for (int i6 = 0; i6 < 6; i6++) {
                                String buff = String.valueOf(slovo.charAt(i1)) +
                                        String.valueOf(slovo.charAt(i2)) +
                                        String.valueOf(slovo.charAt(i3)) +
                                        String.valueOf(slovo.charAt(i4)) +
                                        String.valueOf(slovo.charAt(i5)) +
                                        String.valueOf(slovo.charAt(i6));
                                int a = 0;
                                for (int i = 0; i < buff.length(); i++) if (buff.charAt(i) != 'А') a++;
                                if (a > 2 && !result.contains(buff)) result.add(buff);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result.size()); //15360
    }
}
