package Task23;

import java.util.Arrays;

public class Fipi1 {
    public static void main(String[] args) {
        int[] array = new int[24];
        for (int i = 0; i < array.length - 2; i++) {
            array[i] = array.length - i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 5; i++) {
            array[i] = array[i + 2];
            array[i] += array[i + 5];
        }
        System.out.println(Arrays.toString(array));
    }
}
