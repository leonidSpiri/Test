package Task8_2;

public class Task1 {
    public static void main(String[] args) {
        String slovo = "ВОЛК", result = "";
        int howMany = 0;
        for (int i1 = 0; i1 < 4; i1++) {
            for (int i2 = 0; i2 < 4; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    for (int i4 = 0; i4 < 4; i4++) {
                        for (int i5 = 0; i5 < 4; i5++) {

                            result = String.valueOf(slovo.charAt(i1)) + String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) + String.valueOf(slovo.charAt(i4))
                                    + String.valueOf(slovo.charAt(i5));
                            int V = 0;
                            for (int i = 0; i < 5; i++) {
                                if (String.valueOf(result.charAt(i)).equals("В")) V++;
                            }
                            if (V == 1) {
                                howMany++;
                                System.out.println(result);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(howMany);
    }
}
