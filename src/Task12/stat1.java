package Task12;

public class stat1 {
    public static void main(String[] args) {
        String stroka = "";
        for (int i = 0; i < 99; i++) stroka += "1";
        while (stroka.contains("111")) {
            stroka = stroka.replaceFirst("111", "22");
            stroka = stroka.replaceFirst("222", "11");
        }
        System.out.println(stroka);//221
    }
}
