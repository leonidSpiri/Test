package Task8_2;

/*1)	Вася составляет 5-буквенные слова, в которых есть только буквы С, И, Р, О, П, причём в каждом слове обязательно есть ровно одна буква О,
 при этом стоять она может только после согласной. Каждая из других допустимых букв может встречаться в слове любое количество раз или не
  встречаться совсем. Сколько существует таких слов, которые может написать Вася?*/
public class Task9 {
    public static void main(String[] args) {
        String slovo = "СИРОП";
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
                            int alreadyhas =0;
                            for (int i = 1; i < buff.length(); i++) {
                                if (buff.charAt(i) == 'О' ) {
                                    if (buff.charAt(i - 1) == 'С' || buff.charAt(i - 1) == 'Р' || buff.charAt(i - 1) == 'П') {
                                        if (buff.charAt(i - 1) != 'О' && alreadyhas <2) {
                                            result++;
                                            alreadyhas++;
                                            System.out.println(buff + " " + buff.charAt(i-1));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result); //768
    }
}
