package Task8_2;

/*4)	Борис составляет 6-буквенные коды из букв Б, О, Р, И, С. Буквы Б и Р нужно обязательно использовать ровно по одному разу,
 букву С можно использовать один раз или не использовать совсем, буквы О и И можно использовать произвольное количество раз или
  не использовать совсем. Сколько различных кодов может составить Борис?*/
public class Task4 {
    public static void main(String[] args) {
        String slovo = "БОРИС";
        int result = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            for (int i6 = 0; i6 < 5; i6++) {
                                String buff = String.valueOf(slovo.charAt(i1)) +
                                        String.valueOf(slovo.charAt(i2)) +
                                        String.valueOf(slovo.charAt(i3)) +
                                        String.valueOf(slovo.charAt(i4)) +
                                        String.valueOf(slovo.charAt(i5)) +
                                        String.valueOf(slovo.charAt(i6));
                                int b = 0, r = 0, c = 0;
                                for (int i = 0; i < buff.length(); i++) {
                                    if (buff.charAt(i) == 'Б') b++;
                                    if (buff.charAt(i) == 'Р') r++;
                                    if (buff.charAt(i) == 'С') c++;
                                }
                                if (b == 1 && r == 1 && c < 2) {
                                    result++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result); //1440
    }
}
