package Task8_3;

public class Task6 {
    public static void main(String[] args) {
        String slovo = "ПЕСКАРЬ";
        int result = 0;
        for (int i1 = 0; i1 < 7; i1++) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (i1 == i2) continue;
                for (int i3 = 0; i3 < 7; i3++) {
                    if (i3 == i2 || i3 == i1) continue;
                    for (int i4 = 0; i4 < 7; i4++) {
                        if (i4 == i1 || i4 == i2 || i4 == i3) continue;
                        for (int i5 = 0; i5 < 7; i5++) {
                            if (i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4) continue;
                            for (int i6 = 0; i6 < 7; i6++) {
                                if (i6 == i1 || i6 == i2 || i6 == i3 || i6 == i4 || i6 == i5) continue;
                                for (int i7 = 0; i7 < 7; i7++) {
                                    if (!(i7 == i1 || i7 == i2 || i7 == i3 || i7 == i4 || i7 == i5 || i7 == i6)) {
                                        boolean istrue = true;
                                        String buff = String.valueOf(slovo.charAt(i1)) +
                                                String.valueOf(slovo.charAt(i2)) +
                                                String.valueOf(slovo.charAt(i3)) +
                                                String.valueOf(slovo.charAt(i4)) +
                                                String.valueOf(slovo.charAt(i5)) +
                                                String.valueOf(slovo.charAt(i6)) +
                                                String.valueOf(slovo.charAt(i7));
                                        if (buff.charAt(0) == 'Ь') istrue = false;
                                        for (int i = 1; i < buff.length() - 1; i++) {
                                            String letter = String.valueOf(buff.charAt(i));
                                            String nextLetter = String.valueOf(buff.charAt(i + 1));
                                            if (letter.equals("Ь") && (nextLetter.equals("Е") || nextLetter.equals("А") || nextLetter.equals("Р")))
                                                istrue = false;
                                        }
                                        if (istrue) result++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result); //2520
    }
}
