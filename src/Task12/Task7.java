package Task12;

public class Task7 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 2019; i++) result += "1";
        for (int i = 0; i < 2019; i++) result += "2";

        while (result.contains("222")) {
            result = result.replaceFirst("222", "1");
            result = result.replaceFirst("111", "2");
        }
        System.out.println(result);
    }
}
