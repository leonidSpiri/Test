package Task12;

public class Polkov1 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 1; i <=2018; i++) stroka += "1";
        for (int i = 1; i <= 2019; i++) stroka += "2";
        while (stroka.contains("111")) {
             stroka = stroka.replaceFirst("111", "2");
            stroka = stroka.replaceFirst("222", "1");

        }
        System.out.println(stroka);//11222
    }
}
