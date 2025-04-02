package chapter06.method.recursive;

public class FactorialTest2 {

    public static void main(String[] args) {
        int n = 21;
        long result;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);

            if (result == -1) {
                System.out.println("유효하지 않은 값입니다: " + i);
                break;
            }

            System.out.printf("%d! = %20d\n", i, result);
        }
    }

    //재귀함수: 자기 자신을 호출하는 함수
    static long factorial(long n) {
        if (n <= 0 || n > 20) { //유효성 검사
            return -1;
        }

        if (n <= 1) { //탈출 조건
            return 1;
        }

        return n * factorial(n - 1);
    }

}
