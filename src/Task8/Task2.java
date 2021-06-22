package Task8;

import java.util.ArrayList;

/*Из букв слова К О Р Т И К составляются 6-буквенные последовательности.
 Сколько можно составить различных последовательностей, если известно, что в  каждой из них содержится не менее 3 согласных?*/
public class Task2 {
    public static void main(String[] args) {
        String slovo = "КОРТИК";
        ArrayList<String> result = new ArrayList<>();
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            for (int i6 = 0; i6 < 6; i6++) {
                                String buff = String.valueOf(slovo.charAt(i1)) +
                                        slovo.charAt(i2) +
                                        slovo.charAt(i3) +
                                        slovo.charAt(i4) +
                                        slovo.charAt(i5) +
                                        slovo.charAt(i6);
                                int sogl = 0;
                                for (int i = 0; i < buff.length(); i++) {
                                    if (buff.charAt(i) != 'О' && buff.charAt(i) != 'И') sogl++;
                                }
                                if (sogl > 2 && !result.contains(buff)) result.add(buff);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result.size()); // 12825
    }
}
