package chapter08;

public class ExceptionEx5 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); //예외 발생 -> try 내부의 나머지 코드는 실행되지 않고 바로 catch 내부로 이동한다.
            System.out.println(4); //실행X
        } catch (ArithmeticException e) {
            System.out.println(5);
        }
        System.out.println(6);
    }

}
