package Task12;

public class Task5 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result += "8";
        }
        while (result.contains("888") || result.contains("77")) {
            if (result.contains("888")) result = result.replaceFirst("888", "8777");
            else result = result.replaceFirst("77", "8");
        }
        int seven = 0, eight = 0;

        for (char element : result.toCharArray()
        ) {
            if (element == '7') seven++;
            if (element == '8') eight++;
        }
        System.out.println(seven);
        System.out.println(eight);
    }
}
