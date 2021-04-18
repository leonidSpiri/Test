package Task16;
/*Задание 16
Алгоритм вычисления значения функции F(n), где n – натуральное число, задан следующими соотношениями:
F(n) = n + 15, при n ≤ 5
F(n) = F(n//2) + n*n*n - 1, при чётных n > 5
F(n) = F(n-1) + 2*n*n + 1, при нечётных n > 5
Здесь // обозначает деление нацело. Определите количество натуральных значений n из отрезка [1; 1000], для которых значение F(n) содержит не менее двух цифр 8.
164*/
public class Polkov1 {
    public static void main(String[] args) {
        int otvet = 0;
        for (int n = 1; n < 1001; n++) {
            String result = String.valueOf(F(n));
            int eight = 0;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i)=='8') eight++;
                if (eight >=2) otvet++;
            }
        }
        System.out.println(otvet);
    }

    static int F(int n) {
        if (n <=5) return n+15;
        if (n % 2 == 0 && n > 5) return F(n/2) + n*n*n - 1;
        if (n > 5 && n % 2 != 0) return F(n-1) + 2*n*n + 1;

        return 0;
    }
}
