package Task23;

public class task8 {
    public static void main(String[] args) {
        int result = 0;
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        for (int i5 = 0; i5 < 3; i5++) {
                            for (int i6 = 0; i6 < 3; i6++) {
                                for (int i7 = 0; i7 < 3; i7++) {
                                    int chislo = 3;
                                    chislo = F(i1, chislo);
                                    chislo = F(i2, chislo);
                                    chislo = F(i3, chislo);
                                    chislo = F(i4, chislo);
                                    chislo = F(i5, chislo);
                                    chislo = F(i6, chislo);
                                    chislo = F(i7, chislo);
                                    if (chislo == 22) result++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    static int F(int n, int chislo) {
        switch (n) {
            case 0:
                return chislo += 1;
            case 1:
                return chislo += 2;
            case 2:
                return chislo += 3;
            default:
                return 0;
        }
    }
}
