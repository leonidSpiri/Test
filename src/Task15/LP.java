package Task15;

public class LP {
    public static void main(String[] args) {
// 3 номер в ЛП
       /* 3)	Укажите наибольшее целое значение A, при котором выражение
        (x + y > 10) ∨ ((x + y > A)  (x – y > A))
        тождественно истинно при любых целых неотрицательных x и y?*/

        for (int a = 0; a < 1000; a++) {
            boolean flag = true;
            for (int x = 0; x < 1000; x++) {
                for (int y = 0; y < 1000; y++) {
                    boolean buff = (x + y > 10) || ((x + y > a) && ((x - y) > a));

                    if (!buff) {
                        flag = false;

                    }
                }
            }
            if (flag) System.out.println(a);
        }
    }
}

/*
 * 4: boolean buff = (x>=9) || ((5*y>=x) || (2*x*y<a));
 *
 *
 * */