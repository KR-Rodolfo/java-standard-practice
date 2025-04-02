package chapter06.reference;

public class ReferenceParamEx2 {

    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x))");
        System.out.println("main() : x = " + x[0]);
    }

    public static void change(int[] x) { //배열도 주소값을 반환함으로 참조형 매개변수로 전달받는다.
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }

}
