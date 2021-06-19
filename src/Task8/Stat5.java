package Task8;

public class Stat5 {
    public static void main(String[] args) {
        String slovo = "НАСТЯ";
        int result = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            for (int i6 = 0; i6 < 5; i6++) {
                                String buff = String.valueOf(slovo.charAt(i1)) +
                                        String.valueOf(slovo.charAt(i2)) +
                                        String.valueOf(slovo.charAt(i3)) +
                                        String.valueOf(slovo.charAt(i4)) +
                                        String.valueOf(slovo.charAt(i5)) +
                                        String.valueOf(slovo.charAt(i6));

                                int a = 0, ya = 0;
                                for (int i = 0; i < buff.length(); i++) {
                                    if (buff.charAt(i) == 'А') a++;
                                    if (buff.charAt(i) == 'Я') ya++;
                                }
                                if (a < 2 && ya < 2) result++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result); //6075
    }
}
