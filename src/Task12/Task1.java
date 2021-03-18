package Task12;

public class Task1 {
    public static void main(String[] args) {
        String start = "1";
        for (int i = 0; i < 80; i++) start += "8";
        while (start.contains("18") || start.contains("288") || start.contains("3888")) {
            if (start.contains("18")) start = start.replaceFirst("18", "2");
            else {
                if (start.contains("288")) start = start.replaceFirst("288", "3");
                else start = start.replaceFirst("3888", "1");
            }
        }
        System.out.println(start);
    }
}
