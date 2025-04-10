package chapter08;

public class ExceptionEx2 {

    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10); //임의의 수가 0이 나오는 경우 ArithmeticException 발생
            System.out.println(result);
        }
    }

}
