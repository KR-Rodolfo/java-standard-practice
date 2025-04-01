package chapter05.array;

import java.util.Random;

public class ArrayEx11 {

    //counter
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = new Random().nextInt(10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++; //numArr[i]번 인덱스에 1을 더한다. -> 개수를 세는 효과
        }
        //numArr 원소의 범위가 커질수록 counter 배열의 길이가 길어져야 한다.

        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "의 개수: " + counter[i]);
        }
    }

}
