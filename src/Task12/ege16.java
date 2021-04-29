package Task12;

public class ege16 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 51; i++) stroka += "1122";
        while (stroka.contains("12") || stroka.contains("2222")) {
            if (stroka.contains("12")) stroka = stroka.replaceFirst("12", "2");
            else stroka = stroka.replaceFirst("2222", "2");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //222
    }
}
