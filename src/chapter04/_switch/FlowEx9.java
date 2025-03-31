package chapter04._switch;

import java.util.Scanner;

public class FlowEx9 {

    public static void main(String[] args) {
        char grade = ' ';
        int score;

        System.out.println("당신의 점수를 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        switch (score) { //단 한번만 조건을 비교하면 되지만 코드가 너무 지저분해졌다. -> if 문의 범위 조건을 사용하는 것이 효과적이다.
            case 100: case 99: case 98: case 97: case 96:
            case 95: case 94: case 93: case 92: case 91: case 90:
                grade = 'A';
                break;
            case 89: case 88: case 87: case 86: case 85:
            case 84: case 83: case 82: case 81: case 80:
                grade = 'B';
                break;
            case 79: case 78: case 77: case 76: case 75:
            case 74: case 73: case 72: case 71: case 70:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

}
