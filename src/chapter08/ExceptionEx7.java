package chapter08;

public class ExceptionEx7 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) { //나열된 예외가 부모-자식 관계인 경우 좁은 범위의 자식 예외를 우선적으로 배치한다.
            if (e instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) { //ArithmeticException 제외 나머지 예외
            System.out.println("Exception");
        }
        System.out.println(6);
    }

}
