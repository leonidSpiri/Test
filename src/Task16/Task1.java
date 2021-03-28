package Task16;

/*	F(1) = G(1) = 1
		F(n) = 2·F(n–1) + G(n–1) – 2, если n > 1
		G(n) = F(n–1) +2·G(n–1), если n > 1
Чему равно значение F(14) + G(14)?
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(F(14) + G(14));
// 1594324
    }

    static int F(int n) {
        if (n > 1) return 2 * F(n - 1) + G(n - 1) - 2;
        return 1;
    }

    static int G(int n) {
        if (n > 1) return F(n - 1) + 2 * G(n - 1);
        return 1;
    }
}
