package chapter08;

public class ExceptionEx14 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) { //예외를 호출한 main 메서드가 예외를 처리하는 경우
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception { //발생한 예외를 밖으로 던진다.
        throw new Exception("예외 발생!!!!");
    }

}
