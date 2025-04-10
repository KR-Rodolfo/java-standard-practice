package chapter08;

public class ExceptionEx12 {

    public static void main(String[] args) throws Exception { //main 메서드 밖으로 예외를 던질 경우 JVM의 예외처리기가 printStackTrace 호출.
        method1();
    }

    static void method1() throws Exception { //method2()에서 전달받은 예외를 다시한번 던진다.
        method2();
    }

    static void method2() throws Exception { //내부에서 발생한 체크예외를 처리하지 않고 밖으로 던진다.
        throw new Exception("Exception 던지기");
    }

}
