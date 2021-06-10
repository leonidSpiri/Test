package Task15;

public class Stat3 {
    //https://inf-ege.sdamgia.ru/problem?id=33517
    public static void main(String[] args) {
        for (int a = 1; a < 20; a++) {
            boolean flag = true;
            for (int x = 1; x < 1000; x++) {
                boolean buff = (70 % a == 0) && ((x % 28 != 0) || ((x % a == 0) || (x % 21 != 0)));
                if (!buff) {
                    flag = false;
                    break;
                }

            }
            if (flag) System.out.println(a); //30
        }
    }
}
