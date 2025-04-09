package chapter07._interface;

public class DefaultMethodTest {

    static class Parent {
        public void method2() { //인터페이스의 default 메서드보다 우선된다.
            System.out.println("method2() in Parent");
        }
    }

    static class Child extends Parent implements MyInterface1, MyInterface2 {
        public void method1() { //디폴트 메서드끼리 충돌이 발생하기 때문에 오버라이딩 필요
            System.out.println("method1() in Child");
        }
    }

    interface MyInterface1 {
        default void method1() {
            System.out.println("method1() in MyInterface1");
        }

        default void method2() {
            System.out.println("method2() in MyInterface1");
        }

        static void staticMethod() {
            System.out.println("staticMethod() in MyInterface1");
        }
    }

    interface MyInterface2 {
        default void method1() {
            System.out.println("method1() in MyInterface2");
        }

        default void method2() {
            System.out.println("method2() in MyInterface2");
        }

        static void staticMethod() {
            System.out.println("staticMethod() in MyInterface2");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();

        MyInterface1.staticMethod();
        MyInterface2.staticMethod();
    }

}
