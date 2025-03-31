package chapter04._if;

import java.util.Scanner;

public class FlowEx3 {

    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else { // 조건식을 한번만 검토하면 된다.
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }

}
