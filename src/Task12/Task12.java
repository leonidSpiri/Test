package Task12;

public class Task12 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 30; i++) result += "4";
        for (int i = 0; i < 30; i++) result += "3";
        for (int i = 0; i < 30; i++) result += "5";
        while (result.contains("43") || result.contains("53")) {
            if (result.contains("43")) result = result.replaceFirst("43", "33");
            else result = result.replaceFirst("53", "433");
        }
        result = result.replace("4", "");
        result = result.replace("5", "");
        System.out.println(result);
        System.out.println(result.length());
    }
}
// 60 OR 120 OR 30