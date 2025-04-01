package chapter05.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx2 {

    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = new Random().nextInt(9) + 1;
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }
        System.out.println();

        //Array.toString() 유틸 메서드로 배열 내부를 확인할 수 있다.
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));

        System.out.println(iArr3); //참조값 출력
        System.out.println(chArr); //문자 배열은 문자열로 출력된다.
    }

}
