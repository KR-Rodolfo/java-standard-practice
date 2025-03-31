package chapter04._if;

import java.util.Scanner;

public class FlowEx5 {

    public static void main(String[] args) {
        int score;
        char grade = ' ';
        char opt = '0'; //기본값을 먼저 초기화하여 이후 작성될 조건문의 else 부분을 제거할 수 있다.

        System.out.print("점수를 입력해주세요: ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.println("당신의 점수는 " + score + "입니다.");

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) { //중첩 if 문: 세세한 추가 조건을 작성할 수 있다.
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt += '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.println("당신의 학점은 " + grade + opt + "입니다.");
    }

}
