package Task12;

public class ege6 {
    public static void main(String[] args) {
        String stroka = "1";
        for (int i = 0; i < 30; i++) stroka += "57";

        while (stroka.contains("157") || stroka.contains("1")) {
            if (stroka.contains("157")) stroka = stroka.replaceFirst("157", "5757571");
            else if (stroka.contains("1")) stroka = stroka.replaceFirst("1", "57");

        }
        System.out.println(stroka);
        System.out.println(stroka.length()); //91
    }
}
