package chapter07._super;

public class SuperTest2 {

    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }

    static class Parent {
        int x = 10;
    }

    static class Child extends Parent {
        int x = 20;

        void method() {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("super.x = " + super.x);
        }
    }

}
