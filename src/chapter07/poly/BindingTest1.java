package chapter07.poly;

public class BindingTest1 {

    public static void main(String[] args) {
        //멤버 변수는 참조 변수의 타입을 따라간다.
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        System.out.println("c.x = " + c.x);

        //메서드는 오버라이딩된 메서드가 우선된다.
        p.method();
        c.method();
    }

    static class Parent {
        int x = 100;

        void method() {
            System.out.println("Parent method");
        }
    }

    static class Child extends Parent {
        int x = 200;

        @Override
        void method() {
            System.out.println("Child method");
        }
    }

}
