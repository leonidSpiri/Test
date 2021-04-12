package Task12;

public class ege7 {
    public static void main(String[] args) {
        String stroka = "1";
        for (int i = 0; i < 70; i++) stroka += "2";

        while (stroka.contains("12") || stroka.contains("1")) {
            if (stroka.contains("12")) stroka = stroka.replaceFirst("12", "221");
            else if (stroka.contains("1")) stroka = stroka.replaceFirst("1", "2");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //141
    }
}
