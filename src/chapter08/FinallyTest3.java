package chapter08;

public class FinallyTest3 {

    public static void main(String[] args) {
        method1();
        System.out.println("method1() 의 수행을 마치고 main 메서드로 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1() 이 호출되었습니다.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //return 보다 finally 내부가 먼저 실행된다.
            System.out.println("method1()의 finally 블럭 실행!!");
        }
    }

}
