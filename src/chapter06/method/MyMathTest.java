package chapter06.method;

class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) { //외부에서 부터 값을 받아올 때에는 항상 유효성 검사를 고려하자.
            System.out.println("0으로 나눌 수 없습니다.");
            return -1;
        }
        return a / b;
    }
}

public class MyMathTest {

    public static void main(String[] args) {
        MyMath mm = new MyMath();

        //메서드 호출시 매개변수에 전달한 값은 복사된다. -> 원본에 영향을 끼치지 않는다.(참조 변수가 아닐 경우)
        long result1 = mm.add(5, 3);
        long result2 = mm.subtract(5, 3);
        long result3 = mm.multiply(5, 3);
        double result4 = mm.divide(5, 3);

        System.out.println("mm.add(5, 3) = " + result1);
        System.out.println("mm.subtract(5, 3) = " + result2);
        System.out.println("mm.multiply(5, 3) = " + result3);
        System.out.println("mm.divide(5, 3) = " + result4);
    }

}
