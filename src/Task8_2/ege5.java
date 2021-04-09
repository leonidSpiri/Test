package Task8_2;

public class ege5 {
    public static void main(String[] args) {
        String slovo = "01234567";
        int howMany = 0;
        for (int i1 = 0; i1 < 8; i1++) {
            for (int i2 = 0; i2 < 8; i2++) {
                for (int i3 = 0; i3 < 8; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {

                        String result = String.valueOf(slovo.charAt(i1)) + String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) + String.valueOf(slovo.charAt(i4));
                        int istrue = 0;
                        String buff = "";
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(result.charAt(i)).equals(String.valueOf(result.charAt(i + 1)))) {
                                if (istrue >1 || String.valueOf(result.charAt(i+1)).equals(buff)) {
                                    istrue++;
                                    break;
                                }
                                istrue++;
                                buff = String.valueOf(result.charAt(i));
                            }
                        }

                        if (istrue == 1) {
                            howMany++;

                            System.out.println(result);
                        }

                    }
                }
            }
        }
        System.out.println(howMany);
    }
}
