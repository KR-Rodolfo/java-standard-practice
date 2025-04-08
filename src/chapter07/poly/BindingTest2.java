package chapter07.poly;

public class BindingTest2 {

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child(); //자식은 부모의 멤버를 알 수 있다.

        System.out.println("p.x = " + p.x);
        System.out.println("c.x = " + c.x);

        p.method();
        c.method();
    }

    static class Parent {
        int x = 100;

        void method() {
            System.out.println("Parent Method");
        }
    }

    static class Child extends Parent {

    }

}
