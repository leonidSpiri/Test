package Task12;

public class Stat4 {
    public static void main(String[] args) {
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                for (int c = 0; c < 100; c++) {
                    String stroka = "0";
                    for (int i = 0; i < a; i++) stroka += "1";
                    for (int i = 0; i < b; i++) stroka += "2";
                    for (int i = 0; i < c; i++) stroka += "3";
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
    }
}
