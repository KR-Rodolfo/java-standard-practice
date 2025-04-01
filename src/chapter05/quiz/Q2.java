package chapter05.quiz;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 1, 2, 5, 1, 2, 3, 2, 5};

        int[] count = new int[10];

        for (int i : arr) {
            count[i]++;
        }

        //중복 제거
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        
        //정렬
        for (int i = 1; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.print(i + ", ");
            }
        }
    }

}
