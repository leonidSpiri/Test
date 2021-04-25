package Task8_3;

import java.util.ArrayList;

public class ege15 {
    public static void main(String[] args) {
        String slovo = "AB123";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {

                        String buff = String.valueOf(slovo.charAt(i1)) +
                                String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) +
                                String.valueOf(slovo.charAt(i4));
                        int ab = 0;
                        for (int i = 0; i < buff.length(); i++)
                            if (buff.charAt(i) == 'A' || buff.charAt(i) == 'B') ab++;

                        if (!result.contains(buff) && ab == 1) result.add(buff);
                    }
                }
            }
        }
        System.out.println(result.size()); //504
    }
}
