package Task8_3;

import java.util.ArrayList;

public class ege14 {
    public static void main(String[] args) {
        String slovo = "123456789";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 9; i1++) {
            for (int i2 = 0; i2 < 9; i2++) {
                for (int i3 = 0; i3 < 9; i3++) {
                    String buff = String.valueOf(slovo.charAt(i1)) +
                            String.valueOf(slovo.charAt(i2)) +
                            String.valueOf(slovo.charAt(i3));
                    String has = "";
                    boolean istrue = true;
                    for (int i = 0; i < buff.length(); i++) {
                        if (has.contains(String.valueOf(buff.charAt(i)))) {
                            istrue = false;
                            break;
                        } else has += String.valueOf(buff.charAt(i));
                    }

                    if (!result.contains(buff) && istrue) result.add(buff);
                }
            }
        }
        System.out.println(result.size()); //504
    }
}
