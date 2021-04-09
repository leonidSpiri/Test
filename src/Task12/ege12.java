package Task12;

public class ege12 {
    public static void main(String[] args) {
        String stroka = "1";
        for (int i = 0; i < 25; i++) stroka += "5";

        while (stroka.contains("15") || stroka.contains("1")) {
            if (stroka.contains("15")) stroka = stroka.replaceFirst("15", "5551");
            else if (stroka.contains("1")) stroka = stroka.replaceFirst("1", "5");

        }
        System.out.println(stroka.length()); //76
    }
}
