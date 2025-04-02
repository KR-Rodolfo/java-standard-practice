package chapter06.method;

public class CallStackTest2 {

    public static void main(String[] args) {
        System.out.println("CallStackTest2.main 시작");
        firstMethod();
        System.out.println("CallStackTest2.main 종료");
    }

    static void firstMethod() {
        System.out.println("CallStackTest2.firstMethod 시작");
        secondMethod();
        System.out.println("CallStackTest2.firstMethod 종료");
    }

    static void secondMethod() {
        System.out.println("CallStackTest2.secondMethod 시작");
        System.out.println("CallStackTest2.secondMethod 종료");
    }

}
