package chapter04._switch;

import java.util.Scanner;

public class FlowEx10 {

    public static void main(String[] args) {
        int score;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요(0 ~ 100): ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        switch (score / 10) { //나눗셈을 이용해 case 를 줄였다.
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

}
