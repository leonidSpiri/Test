package Task12;

public class Stat3 {
    public static void main(String[] args) {
        for (int j = 1; j < 1000; j++) {
            String stroka = "0";
            for (int i = 0; i < j; i++) stroka += "1";
            for (int i = 0; i < j; i++) stroka += "2";
            for (int i = 0; i < j; i++) stroka += "3";
            while (stroka.contains("01") || stroka.contains("02") || stroka.contains("03")) {
                stroka = stroka.replaceFirst("01", "30");
                stroka = stroka.replaceFirst("02", "101");
                stroka = stroka.replaceFirst("03", "202");
            }
            String buff = stroka.replace("2", "");
            buff = buff.replace("3", "");
            if (buff.length() == 15) {
                buff = stroka.replace("1", "");
                buff = buff.replace("3", "");
                if (buff.length() == 10) {
                    buff = stroka.replace("1", "");
                    buff = buff.replace("2", "");
                    if (buff.length() == 60) System.out.println(stroka);
                }
            }
        }
    }
}
