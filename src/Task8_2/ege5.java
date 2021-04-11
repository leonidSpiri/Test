package Task8_2;

public class ege5 {
    public static void main(String[] args) {
        String slovo = "01234567";
        int howMany = 0;
        for (int i1 = 0; i1 < slovo.length(); i1++) {
            for (int i2 = 0; i2 < slovo.length(); i2++) {
                for (int i3 = 0; i3 < slovo.length(); i3++) {
                    for (int i4 = 0; i4 < slovo.length(); i4++) {

                        String result = String.valueOf(slovo.charAt(i1)) + String.valueOf(slovo.charAt(i2)) +
                                String.valueOf(slovo.charAt(i3)) + String.valueOf(slovo.charAt(i4));
                        boolean istrue = false;
                        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, zero = 0;
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(result.charAt(i)).equals("0") && String.valueOf(result.charAt(i + 1)).equals("0"))
                                zero++;
                            if (String.valueOf(result.charAt(i)).equals("1") && String.valueOf(result.charAt(i + 1)).equals("1"))
                                one++;
                            if (String.valueOf(result.charAt(i)).equals("2") && String.valueOf(result.charAt(i + 1)).equals("2"))
                                two++;
                            if (String.valueOf(result.charAt(i)).equals("3") && String.valueOf(result.charAt(i + 1)).equals("3"))
                                three++;
                            if (String.valueOf(result.charAt(i)).equals("4") && String.valueOf(result.charAt(i + 1)).equals("4"))
                                four++;
                            if (String.valueOf(result.charAt(i)).equals("5") && String.valueOf(result.charAt(i + 1)).equals("5"))
                                five++;
                            if (String.valueOf(result.charAt(i)).equals("6") && String.valueOf(result.charAt(i + 1)).equals("6"))
                                six++;
                            if (String.valueOf(result.charAt(i)).equals("7") && String.valueOf(result.charAt(i + 1)).equals("7"))
                                seven++;
                        }
                        if (one == 1 && two == 0 && three == 0 && four == 0 && five == 0 && six == 2 && seven == 0 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 1 && three == 0 && four == 0 && five == 0 && six == 0 && seven == 0 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 0 && three == 1 && four == 0 && five == 0 && six == 0 && seven == 0 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 0 && three == 0 && four == 1 && five == 0 && six == 0 && seven == 0 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 0 && three == 0 && four == 0 && five == 1 && six == 0 && seven == 0 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 0 && three == 0 && four == 0 && five == 0 && six == 1 && seven == 0 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 0 && three == 0 && four == 0 && five == 0 && six == 0 && seven == 1 && zero == 0)
                            istrue = true;
                        if (one == 0 && two == 0 && three == 0 && four == 0 && five == 0 && six == 0 && seven == 0 && zero == 1)
                            istrue = true;
                        if (istrue) {
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
