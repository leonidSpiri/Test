package Task16;

/*F(n)=1,  при n=1
F(n)=1, при n=2
F(n)=[(n*F(n-1))/2], если n>2 и четно
F(n)=[(n*(F(n-1)+F(n-2)))/3], если n>2 и нечетно
Чему равно F(13)
Квадратные скобки в записи [x] применяются для обозначения целой части числа х
*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(F(13));
        //930930
    }

    static int F(int n) {
        if (n == 1 || n == 2) return 1;
        if (n > 2 && n % 2 == 0) return (n * F(n - 1)) / 2;
        if (n > 2 && n % 2 != 0) return (n * (F(n - 1) + F(n - 2))) / 3;
        return 0;
    }

}
