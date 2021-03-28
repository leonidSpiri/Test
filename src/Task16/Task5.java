package Task16;

/*Алгоритм вычисления функции F(n), где n – натуральное число, задан следующими соотношениями:
F(n) = n, при n  1,
F(n) = 1 + F(n / 2), когда n > 1 и чётное,
F(n) = 1 + F(n + 2) , когда n > 1 и нечётное.
Назовите минимальное значение n, для которого F(n) = 16.
*/
public class Task5 {
    public static void main(String[] args) {
        for (int i = 1000; i > 0; i--) {
            int n = F(i);
            if (n == 16) System.out.println(i);
        }
    }

    static int F(int n) {
        if (n <= 1) return n;
        if (n % 2 == 0) return 1 + F(n / 2);
        return 1 + F(n + 2);
    }
}
