package Task15;
/*Обозначим через ДЕЛ(n, m) утверждение «натуральное число n делится без остатка на нату-ральное число m».
Для какого наибольшего натурального числа A формула
(A < 50) /\ (   ДЕЛ(x, A) → (   ДЕЛ(x, 10) → ДЕЛ(x, 12)   )   )
тождественно истинна, т. е. принимает значение 1 при любом натуральном x?*/
public class Task1 {
    public static void main(String[] args) {
        for (int a = 1; a < 51; a++) {
            boolean flag = true;
            for (int x = 1; x < 100000; x++) {
                boolean buff = (a < 50) && ((x % a != 0) || ((x % 10 != 0) || (x % 12 == 0)));
                if (!buff) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(a);
        }
    }
}