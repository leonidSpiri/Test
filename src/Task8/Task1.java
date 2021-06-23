package Task8;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        String slovo = "0123456789ABCDEF";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 1; i1 < slovo.length(); i1++) {
            for (int i2 = 0; i2 < slovo.length(); i2++) {
                for (int i3 = 0; i3 < slovo.length(); i3++) {
                    for (int i4 = 0; i4 < slovo.length(); i4++) {
                        for (int i5 = 0; i5 < slovo.length(); i5++) {
                            String buff = String.valueOf(slovo.charAt(i1)) +
                                    slovo.charAt(i2) +
                                    slovo.charAt(i3) +
                                    slovo.charAt(i4) +
                                    slovo.charAt(i5);
                            boolean isGood = buff.charAt(0) != '1';
                            String regex = "02468ACE";
                            if (regex.contains(String.valueOf(buff.charAt(buff.length() - 1)))) {
                                isGood = false;
                            }
                            if (isGood) {// && !result.contains(buff)
                                result.add(buff);
                                System.out.println("i1 = " + i1 + " i2 = " + i2);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result.size()); //
    }
}
