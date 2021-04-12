package Task8_2;

public class ege7 {
    public static void main(String[] args) {
        String slovo = "123456";
        int result = 0;
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            String buff = String.valueOf(slovo.charAt(i1)) +
                                    String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) +
                                    String.valueOf(slovo.charAt(i4)) +
                                    String.valueOf(slovo.charAt(i5));
                            int one = 0;
                            for (int i = 0; i < buff.length(); i++) if (buff.charAt(i) == '1') one++;
                            if (one == 1) result++;
                        }
                    }
                }
            }
        }
        System.out.println(result); // 4651
    }
}
