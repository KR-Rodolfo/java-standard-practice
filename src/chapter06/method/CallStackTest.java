package chapter06.method;

public class CallStackTest {

    public static void main(String[] args) {
        firstMethod();
        System.out.println("CallStackTest.main"); //세번째 실행
    }

    static void firstMethod() {
        secondMethod();
        System.out.println("CallStackTest.firstMethod"); //두번째 실행
    }

    static void secondMethod() {
        System.out.println("CallStackTest.secondMethod"); //첫번째 실행
        return;
        //모든 함수는 return값이 존재한다. (생략해도 컴파일러가 삽입해준다.)
        //return: 자신을 호출한 호출자에게 돌아간다.(firstMethod)
    }

}
