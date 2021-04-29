package Task12;

public class polkov2 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 2018; i++) stroka += "1";
        for (int i = 0; i < 2019; i++) stroka += "2";
        while (stroka.contains("111") || stroka.contains("222")) {
            stroka = stroka.replaceFirst("111", "2");
            stroka = stroka.replaceFirst("222", "1");

        }
        System.out.println(stroka);//2
    }
}
