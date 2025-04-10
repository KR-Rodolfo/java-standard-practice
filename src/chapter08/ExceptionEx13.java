package chapter08;

public class ExceptionEx13 {

    public static void main(String[] args) {
        method1(); //호출한 main 메서드는 예외 발생 사실을 모른다.
    }

    static void method1() { //예외가 발생한 메서드에서 직접 처리하는 경우
        try {
            throw new Exception("예외 발생!!");
        } catch (Exception e) {
            System.out.println("method1에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

}
