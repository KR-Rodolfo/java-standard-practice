package chapter04._while.dowhlie;

import java.util.Scanner;

public class FlowEx28 {

    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1; //1~100까지의 난수를 생성한다.
        Scanner scanner = new Scanner(System.in);

        do { //무조건 한번을 실행된다. -> 주로 사용자 입력을 받기 위해 사용한다.
            System.out.print("1과 100사이의 정수를 입력하세요: ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }

}
