package chapter07._interface;

public class InterfaceTest2 {

    static class A {
        //인터페이스를 도입하면서 A는 I 인스턴스에만 의존한다.
        //매개변수로 넘어오는 구현체가 변해도 클라이언트인 A의 코드는 변하지 않는다.
        void autoPlay(I i) {
            i.play();
        }
    }

    interface I {
        void play();
    }

    static class B implements I {
        @Override
        public void play() {
            System.out.println("play() in B class.");
        }
    }

    static class C implements I {
        @Override
        public void play() {
            System.out.println("play() in C class.");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());

    }

}
