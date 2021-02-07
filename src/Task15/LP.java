package Task15;

public class LP {
    public static void main(String[] args) {
// !!!5: boolean buff = (3*y - x>a) || (2*x+3*y<30) || (2*y-x<-31);
        for (int a = -1000; a < 1000; a++) {
            boolean flag = true;
            for (int x = 0; x < 1000; x++) {
                for (int y = 0; y < 1000; y++) {
                    boolean buff = (x * x - 10 * x + 16 > 0) || (y * y - 10 * y + 21 > 0) || (x * y < 2 * a);

                    if (!buff) {
                        flag = false;

                        break;
                    }
                }
            }
            if (flag) System.out.println(a);
        }
    }
}

/*
 * 3: boolean buff = ((x + y) > 10) || (((x + y) > a) && ((x - y) > a));
 * 4: boolean buff = (x>=9) || ((5*y>=x) || (2*x*y<a));
 * 7: boolean buff = (3*y - 4*x-29 !=0) || (2*x*x+5 > a) ||(y*y-1>a);
 *10: boolean buff = (y-x*x != -80) || (13*x -14> a) || (y*y+15>a);
 *12: boolean buff = (2*y+3*x !=23) || (2*x+3<a) && (3*y+11<a);
 *14: boolean buff = (6*x+4*y !=34) || (5*x+3*y<a) && (4*y+15*x-35<a);
 *16: boolean buff = (x>4) || (x+2<y) || (x*x + y*y<a);
 *18: boolean buff = (x * x - 10 * x + 16 > 0) || (y * y - 10 * y + 21 > 0) || (x * y < 2 * a);
 * */