package chapter06.valiable_intitalization;

public class StaticBlockTest {

    static int[] arr = new int[10];

    static { //스태틱 변수 초기화 가능
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
