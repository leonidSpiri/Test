package Task23;

import java.util.ArrayList;

public class Stat5 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i1 = 1; i1 <= 2; i1++) {
            for (int i2 = 1; i2 <= 2; i2++) {
                for (int i3 = 1; i3 <= 2; i3++) {
                    for (int i4 = 1; i4 <= 2; i4++) {
                        for (int i5 = 1; i5 <= 2; i5++) {
                            for (int i6 = 1; i6 <= 2; i6++) {
                                for (int i7 = 1; i7 <= 2; i7++) {
                                    for (int i8 = 1; i8 <= 2; i8++) {
                                        for (int i9 = 1; i9 <= 2; i9++) {
                                            for (int i10 = 1; i10 <= 2; i10++) {
                                                int x = 1;
                                                x = F(x, i1);
                                                x = F(x, i2);
                                                x = F(x, i3);
                                                x = F(x, i4);
                                                x = F(x, i5);
                                                x = F(x, i6);
                                                x = F(x, i7);
                                                x = F(x, i8);
                                                x = F(x, i9);
                                                x = F(x, i10);
                                                if (!array.contains(x)) array.add(x);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(array.size());
    }

    static int F(int x, int nomer) {
        if (nomer == 1) x *= 2;
        if (nomer == 2) x = x * 2 + 1;
        return x;
    }

}
