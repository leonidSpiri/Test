package Task15;

public class Bit {
    public static void main(String[] args) {
        for (int a = 0; a < 1000; a++) {
            boolean flag = true;
            for (int x = 0; x < 1000; x++) {

                boolean buff = ((x & 51) == 0) || ((x & a) != 0) || !(((x & 11) != 0) || ((x & a) != 0));
                if (!buff) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(a);
        }

    }
}

/*
 * 1:  boolean buff = ((x & 53) == 0) || ((x & 41) != 0) || ((x & a) != 0);
 * 2:  boolean buff = ((x & a) == 0) || ((x & 12) != 0) || ((x & 21) == 0);
 * 3:  boolean buff = ((x & 35) == 0) || ((x & 31) != 0) || ((x & a) != 0);
 * 6:  boolean buff = (((x&13)==0) && ((x&a)!=0)) || ((x&13)!=0) || ((x&a)!=0) || ((x&39)==0);
 * 9:  boolean buff = (((x&46)!=0) && ((x&18)!=0)) || ((x&115)==0) || ((x&a)==0);
 * 11: boolean buff = ((x&51)==0) || ((x&a)!=0)|| !(((x&11)!=0) || ((x&a)!=0));
 * */