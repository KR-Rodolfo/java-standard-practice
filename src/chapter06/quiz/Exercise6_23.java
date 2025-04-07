package chapter06.quiz;

import java.util.Arrays;

public class Exercise6_23 {

    static int max(int[] arr) {
        int max = -999999;
        if (arr == null) {
            return max;
        }

        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{}));
    }

}
