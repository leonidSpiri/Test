package Task12;

public class ege10 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 30; i++) stroka += "321";
        while (stroka.contains("31") || stroka.contains("32")) {
            if (stroka.contains("32")) stroka = stroka.replaceFirst("32", "311");
            else  stroka = stroka.replaceFirst("31", "11");

        }
        stroka = stroka.replace("3", "");
        stroka = stroka.replace("2", "");
        System.out.println(stroka);
        System.out.println(stroka.length()); //
    }
}
