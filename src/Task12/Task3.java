package Task12;

public class Task3 {
    public static void main(String[] args) {
        String result = "3";
        for (int i = 0; i < 100; i++) {
            result += "6";
        }
        result += "3";
        while (result.contains("63") || result.contains("664") || result.contains("6665")) {
            if (result.contains("63")) result = result.replaceFirst("63", "4");
            if (result.contains("664")) result = result.replaceFirst("664", "5");
            if (result.contains("6665")) result = result.replaceFirst("6665", "3");
        }
        System.out.println(result);
    }
}
