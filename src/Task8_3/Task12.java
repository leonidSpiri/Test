package Task8_3;

import java.util.ArrayList;

public class Task12 {
    /*Дано слово ТАРАКАНИЩЕ. Таня решила составлять новые 6-буквенные слова из букв этого слова по следующим правилам:
    1) слово начинается с согласной буквы;
    2) согласные и гласные буквы в слове должны чередоваться;
    3) буквы в слове не должны повторяться. Сколько существует таких слов?  Т Р К Н Щ   */
    public static void main(String[] args) {
        String slovo = "ТАРАКАНИЩЕ";
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i1 = 0; i1 < 10; i1++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i1 == i2) continue;
                for (int i3 = 0; i3 < 10; i3++) {
                    if (i3 == i2 || i3 == i1) continue;
                    for (int i4 = 0; i4 < 10; i4++) {
                        if (i4 == i1 || i4 == i2 || i4 == i3) continue;
                        for (int i5 = 0; i5 < 10; i5++) {
                            if (i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4) continue;
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (!(i6 == i1 || i6 == i2 || i6 == i3 || i6 == i4 || i6 == i5)) {
                                    String buff = String.valueOf(slovo.charAt(i1)) +
                                            String.valueOf(slovo.charAt(i2)) +
                                            String.valueOf(slovo.charAt(i3)) +
                                            String.valueOf(slovo.charAt(i4)) +
                                            String.valueOf(slovo.charAt(i5)) +
                                            String.valueOf(slovo.charAt(i6));
                                    boolean istrue = true;
                                    if (buff.charAt(0) != 'A' && buff.charAt(0) != 'И' && buff.charAt(0) != 'Е') {

//Т Р
                                        for (int i = 1; i < buff.length(); i++) {
                                            String letter = String.valueOf(buff.charAt(i));
                                            String prevLetter = String.valueOf(buff.charAt(i - 1));
                                            if ((letter.equals("К") || letter.equals("Щ") || letter.equals("Н") || letter.equals("Т") || letter.equals("Р")) &&
                                                    (prevLetter.equals("А") || prevLetter.equals("И") || prevLetter.equals("Е"))) {
                                            } else {
                                                if ((letter.equals("А") || letter.equals("И") || letter.equals("Е")) &&
                                                        (prevLetter.equals("К") || prevLetter.equals("Щ") || prevLetter.equals("Н") || prevLetter.equals("Т") || prevLetter.equals("Р"))) {
                                                } else {
                                                    istrue = false;
                                                }
                                            }
                                        }
                                        if (!arrayList.contains(buff) && istrue) arrayList.add(buff);


                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(arrayList.size());
    }
}
