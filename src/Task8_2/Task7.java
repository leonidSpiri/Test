package Task8_2;

public class Task7 {
    public static void main(String[] args) {
        String slovo = "КОМАР";
        int result = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {
                        String buff = String.valueOf(slovo.charAt(i1)) +
                                String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) +
                                String.valueOf(slovo.charAt(i4));
                        int a = 0;
                        for (int i = 0; i < buff.length(); i++) if (buff.charAt(i) == 'А') a++;
                        if (a < 4) result++;
                    }

                }
            }
        }
        System.out.println(result); // 624
    }
}
