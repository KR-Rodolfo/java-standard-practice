package chapter08;

public class ExceptionEx17 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다."); //main 메서드에서 필요한 작업을 마저 수행한다.
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception("예외 발생");
        } catch (Exception e) {
            System.out.println("method1 에서 예외와 관련한 작업을 수행합니다.");
            throw e; //다시 예외를 던진다.
        }
    }

}
