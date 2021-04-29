package Task8_3;

import java.util.ArrayList;

public class ege13 {
    public static void main(String[] args) {
        String slovo = "ABC";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        for (int i5 = 0; i5 < 3; i5++) {
                            for (int i6 = 0; i6 < 3; i6++) {
                                String buff = String.valueOf(slovo.charAt(i1)) +
                                        String.valueOf(slovo.charAt(i2)) +
                                        String.valueOf(slovo.charAt(i3)) +
                                        String.valueOf(slovo.charAt(i4)) +
                                        String.valueOf(slovo.charAt(i5)) +
                                        String.valueOf(slovo.charAt(i6));
                                int aa = 0;
                                for (int i = 0; i < buff.length(); i++) if (buff.charAt(i) == 'A') aa++;
                                if (!result.contains(buff) && aa == 2) result.add(buff);

                            }

                        }
                    }
                }
            }
        }
        System.out.println(result.size()); //240
    }
}
