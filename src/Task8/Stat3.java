package Task8;

import java.util.ArrayList;

public class Stat3 {
    public static void main(String[] args) {
        String slovo = "ТИМОФЕЙ";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 7; i1++) {
            for (int i2 = 0; i2 < 7; i2++) {
                for (int i3 = 0; i3 < 7; i3++) {
                    for (int i4 = 0; i4 < 7; i4++) {
                        for (int i5 = 0; i5 < 7; i5++) {
                            String buff = String.valueOf(slovo.charAt(i1)) +
                                    String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) +
                                    String.valueOf(slovo.charAt(i4)) +
                                    String.valueOf(slovo.charAt(i5));

                            int t = 0, y = 0;
                            for (int i = 0; i < buff.length(); i++) {
                                if (buff.charAt(i) == 'Й') y++;
                                if (buff.charAt(i) == 'Т') t++;
                            }
                            if (t > 0 && y < 2) if (!result.contains(buff)) result.add(buff);

                        }
                    }
                }
            }
        }
        System.out.println(result.size()); //8006
    }
}
