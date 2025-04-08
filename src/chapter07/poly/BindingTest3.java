package chapter07.poly;

public class BindingTest3 {

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x); //Parent 타입의 x를 찾는다.
        p.method(); //오버라이딩된 메서드 실행
        System.out.println();

        System.out.println("c.x = " + c.x); //Child 타입의 x를 찾는다.
        c.method(); //오버라이딩된 메서드 실행
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
            System.out.println("x = " + x);
            System.out.println("super.x = " + super.x); //부모의 x를 명시한다.
            System.out.println("this.x = " + this.x);
        }
    }

}
