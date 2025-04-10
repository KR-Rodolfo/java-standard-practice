package chapter08;

public class ExceptionEx8 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) {
            e.printStackTrace(); //예외 메세지 + 호출 스택
            System.out.println("예외 메세지: " + e.getMessage()); //예외 메세지
        }
        System.out.println(6);
    }

}
