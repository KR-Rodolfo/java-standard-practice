package chapter07._interface;

public class InterfaceTest3 {

    static class A {
        void methodA() {
            //제 3의 클래스가 대신 객체를 제공해주는 방식으로도 활용 가능.
            //InstanceDriver가 어떤 객체를 반환해도 I 타입 참조변수로 할당받을 수 있다.
            I instance = InstanceDriver.getInstance();
            instance.methodB();
            System.out.println(instance);
        }
    }

    interface I {
        void methodB();
    }

    static class B implements I {
        @Override
        public void methodB() {
            System.out.println("methodB in B class");
        }

        @Override
        public String toString() {
            return "class B";
        }
    }

    static class InstanceDriver {
        public static I getInstance() {
            return new B();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }

}
