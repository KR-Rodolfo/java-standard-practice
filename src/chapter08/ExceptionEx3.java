package chapter08;

public class ExceptionEx3 {

    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10); //예외 발생
                System.out.println(result);
            } catch (ArithmeticException e) { //ArithmeticException 처리
                System.out.println("0");
            }
            System.out.println("정상 흐름");
        }
    }

}
