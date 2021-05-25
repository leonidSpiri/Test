package Task8;

import java.util.ArrayList;

public class Stat1 {
    public static void main(String[] args) {
        String slovo = "АНДРЕЙ";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            for (int i6 = 0; i6 < 6; i6++) {
                                for (int i7 = 0; i7 < 6; i7++) {
                                    String buff = String.valueOf(slovo.charAt(i1)) +
                                            String.valueOf(slovo.charAt(i2)) +
                                            String.valueOf(slovo.charAt(i3)) +
                                            String.valueOf(slovo.charAt(i4)) +
                                            String.valueOf(slovo.charAt(i5)) +
                                            String.valueOf(slovo.charAt(i6)) +
                                            String.valueOf(slovo.charAt(i7));
                                    boolean isgood = true;
                                    if (buff.charAt(0) == 'Й') isgood = false;
                                    int a = 0, y = 0;
                                    for (int i = 0; i < buff.length(); i++) {
                                        if (buff.charAt(i) == 'А') a++;
                                        if (buff.charAt(i) == 'Й') y++;
                                    }
                                    if (a == 1 && y == 1 && isgood) {
                                        if (!result.contains(buff)) result.add(buff);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result.size()); //36864
    }
}
