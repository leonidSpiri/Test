package Task12;

public class Fipi1 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 81; i++) stroka += "1";

        while (stroka.contains("88888") || stroka.contains("1111")) {
            if (stroka.contains("1111")) stroka = stroka.replaceFirst("1111", "888");
            else stroka = stroka.replaceFirst("88888", "888");
        }
        System.out.println(stroka); //88881
    }
}
