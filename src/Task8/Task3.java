package Task8;

public class Task3 {
    public static void main(String[] args) {
        String slovo = "КЛОУН", result = "";
        int howMany = 0;
        for (int i1 = 0; i1 < 5; i1++)  //1-я буква, одна из 5-ти возможных
        {
            for (int i2 = 0; i2 < 5; i2++)  //2-я буква, одна из 5-ти возможных
            {
                for (int i3 = 0; i3 < 5; i3++)  //3-я буква, одна из 5-ти возможных
                {
                    for (int i4 = 0; i4 < 5; i4++)  //3-я буква, одна из 5-ти возможных
                    {
                        result = String.valueOf(slovo.charAt(i1)) + String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) + String.valueOf(slovo.charAt(i4));
                        int V = 0;
                        for (int i = 0; i < 4; i++) {
                            if (String.valueOf(result.charAt(i)).equals("У")) V++;
                        }
                        if (V > 0) {
                            howMany++;
                        }
                    }
                }
            }
        }
        System.out.println(howMany);
    }
}
