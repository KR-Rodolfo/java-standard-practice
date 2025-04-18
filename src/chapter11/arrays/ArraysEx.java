package chapter11.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysEx {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {
                {11, 22, 33},
                {21, 22, 23}
        };

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D)); //재귀적으로 toString() 호출

        //배열 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        //배열 채우기
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> new Random().nextInt(6));
        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        // 배열 비교
        String[][] str2D_1 = {
                {"aaa", "bbb"},
                {"AAA", "BBB"}
        };

        String[][] str2D_2 = {
                {"aaa", "bbb"},
                {"AAA", "BBB"}
        };

        System.out.println("Arrays.equals(str2D_1, str2D_2) = " + Arrays.equals(str2D_1, str2D_2)); //false
        System.out.println("Arrays.deepEquals(str2D_1, str2D_2) = " + Arrays.deepEquals(str2D_1, str2D_2)); //true

        //배열 정렬과 탐색
        char[] chArr = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("Arrays.binarySearch(chArr, 'B') = " + Arrays.binarySearch(chArr, 'B')); //이진 탐색 전 배열 정렬 필요

        Arrays.sort(chArr); //자연 순서로 정렬(Comparable)
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("Arrays.binarySearch(chArr, 'B') = " + Arrays.binarySearch(chArr, 'B')); //1
    }

}
