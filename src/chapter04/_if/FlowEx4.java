package chapter04._if;

import java.util.Scanner;

public class FlowEx4 {

    public static void main(String[] args) {
        int score;
        //char grade = ' '; //char 형은 반드시 값이 필요하다.
        char grade = 'D'; //기본값을 먼저 설정해 코드의 길이를 줄일 수 있다.

        System.out.print("점수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) { //90 이상인 경우는 앞선 조건에서 필터링 된다.
            grade = 'B';
        } else if (score >= 70) { //80 이상인 경우는 앞선 조건에서 필터링 된다.
            grade = 'C';
        } //else {
        //    grade = 'D';
        //}

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

}
