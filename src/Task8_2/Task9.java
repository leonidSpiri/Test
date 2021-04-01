package Task8_2;

public class Task9 {
    public static void main(String[] args) {
        String slovo = "СИРОП";
        int result = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            String buff = String.valueOf(slovo.charAt(i1)) +
                                    String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) +
                                    String.valueOf(slovo.charAt(i4)) +
                                    String.valueOf(slovo.charAt(i5));
                            int o = 0;
                            boolean istrue = true;
                            if (buff.charAt(0) != 'О') {
                                for (int i = 1; i < buff.length(); i++) {
                                    if (buff.charAt(i) == 'О') {
                                        o++;
                                        if (!(buff.charAt(i - 1) == 'С' || buff.charAt(i - 1) == 'Р' || buff.charAt(i - 1) == 'П'))
                                            istrue = false;
                                    }
                                }
                                if (o == 1 && istrue) result++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result); //768
    }
}
