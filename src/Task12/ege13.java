package Task12;

public class ege13 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 40; i++) stroka += "123";
        while (stroka.contains("12") || stroka.contains("333")) {
            if (stroka.contains("12")) stroka = stroka.replaceFirst("12", "3");
            else stroka = stroka.replaceFirst("333", "3");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //33
    }
}
