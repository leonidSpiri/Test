package Task8_3;

import java.util.ArrayList;

public class ege12 {
    public static void main(String[] args) {
        String slovo = "ABCD";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 4; i1++) {
            for (int i2 = 0; i2 < 4; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    for (int i4 = 0; i4 < 4; i4++) {
                        String buff = String.valueOf(slovo.charAt(i1)) +
                                String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) +
                                String.valueOf(slovo.charAt(i4));
                        int a = 0;
                        for (int i = 0; i < buff.length(); i++) if (buff.charAt(i) == 'A') a++;
                        if (!result.contains(buff) && a == 2) result.add(buff);

                    }

                }
            }
        }
        System.out.println(result.size()); //54
    }
}
