package chapter05.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx10 {

    //버블 정렬
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = new Random().nextInt(9) + 1;
        }

        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length - 1; i++) { //한번의 라운드 당 하나의 수가 정렬된다.
            for (int j = 0; j < numArr.length - i - 1; j++) { //swap 발생
                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                }
            }

            System.out.println(i + 1 + "번 째 라운드");
            System.out.println(Arrays.toString(numArr));
        }

    }

}
