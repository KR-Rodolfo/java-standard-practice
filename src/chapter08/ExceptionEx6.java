package chapter08;

public class ExceptionEx6 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); //예외 발생
            System.out.println(4); //실행X
        } catch (Exception e) { //Exception 클래스를 포함한 자식 타입 예외를 모두 잡는다. (다형성)
            System.out.println(5);
        }
        System.out.println(6);
    }

}
