package Task8_2;

public class ege6 {
    public static void main(String[] args) {
        String slovo = "0123456789";
        int howMany = 0;
        for (int i1 = 0; i1 < slovo.length(); i1++) {
            for (int i2 = 0; i2 < slovo.length(); i2++) {
                for (int i3 = 0; i3 < slovo.length(); i3++) {
                    for (int i4 = 0; i4 < slovo.length(); i4++) {

                        String result = String.valueOf(slovo.charAt(i1)) + String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) + String.valueOf(slovo.charAt(i4));
                        int istrue = 0;
                        String buff = "";
                        for (int i = 0; i < 3; i++) {
                            String valueOf = String.valueOf(result.charAt(i + 1));
                            if (
                                    valueOf.equals(buff) || String.valueOf(result.charAt(i)).equals(buff)) {
                                istrue += 2;
                            }

                            if (String.valueOf(result.charAt(i)).equals(valueOf)) {
                                if (istrue > 1 || valueOf.equals(buff) || String.valueOf(result.charAt(i)).equals(buff)) {
                                    istrue += 2;
                                } else {
                                    istrue++;
                                    buff = String.valueOf(result.charAt(i));
                                }
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
