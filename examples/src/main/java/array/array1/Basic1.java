package array.array1;

import java.util.Arrays;

public class Basic1 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i+1;
        }
        System.out.println(Arrays.toString(ar));
    }
}
