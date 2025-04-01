package chapter05.array;

import java.util.Random;

public class ArrayEx7 {

    //섞기
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = new Random().nextInt(10); //난수 생성
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }

}
