package chapter08;

public class ExceptionEx4 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) { //예외가 발생하지 않기 때문에 catch 내부의 코드가 실행되지 않는다.
            System.out.println(5);
        }
        System.out.println(6);
    }

}
