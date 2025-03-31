package chapter04._switch;

import java.util.Scanner;

public class FlowEx6 {

    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) { //하나의 조건식의 경우의 수가 많은 경우에 사용한다.
            case 3: case 4: case 5: //가독성을 위해 case 조건을 나열할 수 있다.
                System.out.println("현재 계절은 봄 입니다.");
                break; //case 문을 구분하기 위해 필요하다.
            case 6: case 7: case 8:
                System.out.println("현재 계절은 여름 입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절은 가을 입니다.");
                break;
            default: //case 12: case 1: case 2:
                System.out.println("현재 계절은 겨울 입니다.");
        }
    }

}
