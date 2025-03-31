package chapter04._switch;

import java.util.Scanner;

public class FlowEx7 {

    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요: ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int computer = (int) (Math.random() * 3) + 1; //1~3 까지의 임의의 정수

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴퓨터는 " + computer + "입니다.");

        switch (user - computer) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 0:
                System.out.println("당신이 비겼습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break; //마지막 문장이기 때문에 break 를 생략할 수 있다.
        }

    }

}
