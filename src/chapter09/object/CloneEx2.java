package chapter09.object;

import java.util.Arrays;

public class CloneEx2 {

    public static void main(String[] args) {
        //배열 또한 Cloneable 인터페이스를 구현하고 있다.
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();

        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }

}
