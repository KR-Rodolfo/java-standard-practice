package chapter06.method.classmethod;

class MyMath2 {
    long a;
    long b;

    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double division() {
        if (b == 0) {
            return -1;
        }
        return (double) a / b;
    }

    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }
}

public class MyMathTest2 {

    public static void main(String[] args) {
        //클래스 메서드: 인스턴스를 참조하는 과정을 거치기 때문에 인스턴스 메서드보다 성능이 좋다.
        //외부에서 데이터를 넘겨주어야 한다.
        System.out.println(MyMath2.add(200, 200));
        System.out.println(MyMath2.subtract(200, 100));
        System.out.println(MyMath2.multiply(200, 100));
        System.out.println(MyMath2.division(200, 100));
        System.out.println();

        MyMath2 mm = new MyMath2();
        mm.a = 200;
        mm.b = 200;
        //인스턴스 메서드: 객체 내부의 데이터를 사용한다. -> 외부에서 데이터를 넘겨받는 의존성이 제거되기 때문에 변경에 유리하다.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.division());
    }

}
