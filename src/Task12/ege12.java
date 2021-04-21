package Task12;

public class ege12 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 101; i++) stroka += "45";
        while (stroka.contains("454") || stroka.contains("55")) {
            if (stroka.contains("454")) stroka = stroka.replaceFirst("454", "5");
            else stroka = stroka.replaceFirst("55", "5");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //545
    }
}
