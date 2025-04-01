package chapter05.array;

public class ArrayEx3 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("[변경 전]");
        System.out.println("arr.length = " + arr.length);
        //반복문을 이용해 배열 초기화
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + "=" + arr[i]);
        }
        System.out.println();

        //기존 배열의 길이의 2배인 새로운 배열 생성
        int[] tmp = new int[arr.length * 2];

        //생성한 배열의 기존 배열의 값을 복사한다.
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        //arr에 새로 생성한 배열의 참조값을 할당한다.
        arr = tmp;

        System.out.println("[변경 후]");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + "=" + arr[i]);
        }
    }

}
