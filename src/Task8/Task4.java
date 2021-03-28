package Task8;

public class Task4 {
    public static void main(String[] args) {
        string slovo = "МИР";
        int s = 0;
        string res = "";
        for (int i1 = 0; i1 <= 2; i1++)//1-я буква, одна из 3-х возможных
        {
            for (int i2 = 0; i2 <= 2; i2++) //2-я буква, одна из 3-х возможных
            {
                if (i2 == i1) {continue;} //если буква уже есть, то следующая итерация
                for (int i3 = 0; i3 <= 2; i3++)//3-я буква, одна из 3-х возможных
                {
                    if (i3 == i2 || i3 == i1){continue;}
                    res = slovo[i1].ToString() + slovo[i2].ToString() + slovo[i3];
                    s++;
                    Console.WriteLine(s.ToString() + " " + res);
                }
            }
        }

    }
}
