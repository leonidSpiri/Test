package Task12;

public class ege4 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 93; i++) stroka += "1";

        while (stroka.contains("2222") || stroka.contains("1111")) {
            if (stroka.contains("2222")) stroka = stroka.replaceFirst("2222", "11");
            else stroka = stroka.replaceFirst("1111", "22");
        }
        System.out.println(stroka); //111
    }
}
