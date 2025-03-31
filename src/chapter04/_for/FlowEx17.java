package chapter04._for;

import java.util.Scanner;

public class FlowEx17 {

    public static void main(String[] args) {
        int num = 0;
        System.out.print("*을 출력할 라인의 수를 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp); //문자열을 정수로 변환한다.

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) { //i번째 행일 때 *을 i번 찍으면 삼각형 모양을 출력할 수 있다.
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
