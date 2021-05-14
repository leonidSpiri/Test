package Task12;

public class Polkov3 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 2019; i++) stroka += "1";
        for (int i = 0; i < 2019; i++) stroka += "3";
        while (stroka.contains("111")) {
            stroka = stroka.replaceFirst("111", "2");
            stroka = stroka.replaceFirst("222", "3");
            stroka = stroka.replaceFirst("333", "1");
        }
        System.out.println(stroka);//3211
    }
}
