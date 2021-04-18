package Task12;
/*НАЧАЛО
  ПОКА нашлось (111)
    заменить (111, 2)
    заменить (222, 1)
  КОНЕЦ ПОКА
КОНЕЦ*/
public class Polkov1 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 2019; i++) stroka += "1";
        for (int i = 0; i < 2020; i++) stroka += "2";
        while (stroka.contains("111")) {
             stroka = stroka.replaceFirst("111", "2");
            stroka = stroka.replaceFirst("222", "1");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //141
    }
}
