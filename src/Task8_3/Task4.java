package Task8_3;

public class Task4 {
    public static void main(String[] args) {
        String slovo = "КОЛУН";
        int result = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (i1 == i2) continue;
                for (int i3 = 0; i3 < 5; i3++) {
                    if (i3 == i2 || i3 == i1) continue;
                    for (int i4 = 0; i4 < 5; i4++) {
                        if (i4 == i1 || i4 == i2 || i4 == i3) continue;
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (!(i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4)) {
                                String buff = String.valueOf(slovo.charAt(i1)) +
                                        String.valueOf(slovo.charAt(i2)) +
                                        String.valueOf(slovo.charAt(i3)) +
                                        String.valueOf(slovo.charAt(i4)) +
                                        String.valueOf(slovo.charAt(i5));
                                boolean istrue = true;
                                for (int i = 1; i < buff.length(); i++) {
                                    String letter = String.valueOf(buff.charAt(i));
                                    String prevLetter = String.valueOf(buff.charAt(i - 1));
                                    if ((letter.equals("К") || letter.equals("Л") || letter.equals("Н")) && (prevLetter.equals("О") || prevLetter.equals("У"))) {
                                    } else {
                                        if ((letter.equals("О") || letter.equals("У")) && (prevLetter.equals("К") || prevLetter.equals("Л") || prevLetter.equals("Н"))) {
                                        } else {
                                            istrue = false;
                                        }
                                    }
                                }
                                if (istrue) result++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result); //12
    }
}
