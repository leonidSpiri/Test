package Task12;

public class ege14 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 71; i++) stroka += "123";
        while (stroka.contains("12") || stroka.contains("3333")) {
            if (stroka.contains("12")) stroka = stroka.replaceFirst("12", "3");
            else stroka = stroka.replaceFirst("3333", "3");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //3
    }
}
