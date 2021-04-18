package Task12;

public class ege9 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 50; i++) stroka += "2";
        for (int i = 0; i < 50; i++) stroka += "3";
        for (int i = 0; i < 50; i++) stroka += "1";
        while (stroka.contains("31") || stroka.contains("32")) {
            if (stroka.contains("32")) stroka = stroka.replaceFirst("32", "3");
            else  stroka = stroka.replaceFirst("31", "11");

        }
        stroka = stroka.replace("3", "");
        stroka = stroka.replace("2", "");
        System.out.println(stroka);
        System.out.println(stroka.length()); //141
    }
}
