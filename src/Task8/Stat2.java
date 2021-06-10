package Task8;

import java.util.ArrayList;

public class Stat2 {
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
                            boolean isgood = buff.charAt(0) != 'Й' && buff.charAt(buff.length() - 1) != 'Й';
                            int y = 0;
                            for (int i = 1; i < buff.length() - 1; i++) {
                                if (buff.charAt(i) == 'Й') {
                                    y++;
                                    if (buff.charAt(i - 1) == 'И') isgood = false;
                                    if (buff.charAt(i + 1) == 'И') isgood = false;
                                }
                            }
                            if (isgood && y < 2) if (!result.contains(buff)) result.add(buff);

                        }
                    }
                }
            }
        }
        System.out.println(result.size()); //10476
    }
}
