package Task8;

public class Task1 {
    public static void main(String[] args) {
        String slovo = "0123456789ABCDEF";
        int result = 0;
        for (int i1 = 0; i1 < slovo.length(); i1++) {
            for (int i2 = 0; i2 < slovo.length(); i2++) {
                for (int i3 = 0; i3 < slovo.length(); i3++) {
                    for (int i4 = 0; i4 < slovo.length(); i4++) {
                        for (int i5 = 0; i5 < slovo.length(); i5++) {
                            String buff = String.valueOf(slovo.charAt(i1)) +
                                    String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) +
                                    String.valueOf(slovo.charAt(i4)) +
                                    String.valueOf(slovo.charAt(i5));
                            boolean isGood = buff.charAt(0) != '1';
                            String regex = "02468ACE";
                            if (regex.contains(String.valueOf(buff.charAt(buff.length() - 1)))) {
                                isGood = false;
                            }
                            if (isGood) result++;
                        }
                    }
                }
            }
        }
        System.out.println(result); //
    }
}
