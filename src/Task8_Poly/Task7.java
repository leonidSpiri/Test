package Task8_Poly;

/*Вася составляет 5-буквенные слова, в которых есть только буквы П, И, Р, О, Г, причём в каждом слове буква Р может
встречаться не более двух раз, при этом, если она есть, то после неё обязательно стоит гласная буква.
Все допустимые буквы, кроме Р, могут встречаться в слове любое количество раз или не встречаться совсем.
Словом считается любая допустимая последовательность букв, не обязательно осмысленная.
Сколько существует таких слов, которые может написать Вася?
*/
public class Task7 {
    public static void main(String[] args) {
        String slovo = "ПИРОГ";
        int result = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            String buff = String.valueOf(slovo.charAt(i1)) +
                                    String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) +
                                    String.valueOf(slovo.charAt(i4)) +
                                    String.valueOf(slovo.charAt(i5));
                            int r = 0;
                            boolean istrue = true;
                            for (int i = 0; i < buff.length() - 1; i++) {
                                if (buff.charAt(i) == 'Р') {
                                    if (buff.charAt(i + 1) != 'И' || buff.charAt(i + 1) != 'О') istrue = false;
                                }
                            }
                            for (int i = 0; i < buff.length(); i++) if (buff.charAt(i) == 'Р')r++;
                            if (r < 3 && istrue) result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
