package Task12;

public class ege11 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 80; i++) stroka += "12";
        while (stroka.contains("121") || stroka.contains("22")) {
            if (stroka.contains("121")) stroka = stroka.replaceFirst("121", "2");
            else stroka = stroka.replaceFirst("22", "2");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //2
    }
}
