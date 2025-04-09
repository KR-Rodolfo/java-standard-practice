package chapter07._interface;

public class InterfaceTest1 {

    static class A {
        void methodA(B b) { //클래스 B를 직접 의존하는 구조, B 인스턴스를 교체하려면 클라이언트인 A도 영향을 받는다.
            b.methodB();
        }
    }

    static class B {
        void methodB() {
            System.out.println("methodB");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }

}
