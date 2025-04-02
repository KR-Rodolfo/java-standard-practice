package chapter06.method.recursive;

public class FactorialTest {

    public static void main(String[] args) {
        int result = factorial(5);

        System.out.println(result);
    }

    //재귀함수: 자기 자신을 호출하는 함수
    static int factorial(int n) {
        if (n == 1) { //재귀함수는 탈출조건이 필수적이다.
            return 1;
        }

        return n * factorial(n - 1);
    }

}
