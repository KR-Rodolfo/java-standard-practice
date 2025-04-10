package chapter08;

public class ExceptionEx9 {

    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킨 예외"); //예외 객체를 생성한다.
            throw e; //생성된 예외 객체로 예외를 발생시킨다.
        } catch (Exception e) {
            System.out.println("에러 메세지: " + e.getMessage()); //고의로 발생시킨 예외
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }

}
