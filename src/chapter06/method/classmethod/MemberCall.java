package chapter06.method.classmethod;

public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv; //클래스 변수는 프로그램 실행과 동시에 생성되기 때문에 인스턴스가 접근 가능하다.
    //static int cv2 = iv; //클래스 변수는 인스턴스 변수를 사용할 수 없다.
    static int cv2 = new MemberCall().iv; //객체가 먼저 생성해야 인스턴스를 통해 iv에 접근 가능하다.

    static void staticMethod1() {
        System.out.println(cv);
        //System.out.println(iv); //인스턴스의 참조값을 알 수 없음.
        System.out.println(new MemberCall().iv);
    }

    void instanceMethod1() {
        System.out.println(cv); //클래스 영역에 접근 가능
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1();
        new MemberCall().instanceMethod1();
    }

    void instanceMethod2() {
        instanceMethod1();
        staticMethod1();
    }

}
