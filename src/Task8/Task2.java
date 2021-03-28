package Task8;

public class Task2 {
    public static void main(String[] args) {
        String slovo = "АВСХ", result = "";
        int howMany = 0;
        for (int i1 = 0; i1 < 4; i1++)  //1-я буква, одна из 5-ти возможных
        {
            for (int i2 = 0; i2 < 4; i2++)  //2-я буква, одна из 5-ти возможных
            {

                for (int i3 = 0; i3 < 4; i3++)  //3-я буква, одна из 5-ти возможных
                {
                    for (int i4 = 0; i4 < 4; i4++)  //3-я буква, одна из 5-ти возможных
                    {
                        for (int i5 = 0; i5 < 4; i5++)  //3-я буква, одна из 5-ти возможных
                        {

                            result = String.valueOf(slovo.charAt(i1)) + String.valueOf(slovo.charAt(i2)) +
                                    String.valueOf(slovo.charAt(i3)) + String.valueOf(slovo.charAt(i4))
                                    + String.valueOf(slovo.charAt(i5)); //кодовое слово
                            int V = 0;
                            for (int i = 0; i < 5; i++) {
                                if (String.valueOf(result.charAt(i)).equals("Х")) V++;
                            }
                            if (V == 0 || (V == 1 && String.valueOf(result.charAt(4)).equals("Х"))) {
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
