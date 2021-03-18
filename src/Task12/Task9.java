package Task12;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 50; i < 100; i++) {
            String result = "";
            for (int j = 0; j < i; j++) result += "1";
            while (result.contains("111")) {
                result = result.replaceFirst("111", "2");
                result = result.replaceFirst("222", "1");
            }
            if (result.equals("22")) System.out.println(i);
        }
    }
}
