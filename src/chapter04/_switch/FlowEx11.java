package chapter04._switch;

import java.util.Scanner;

public class FlowEx11 {

    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요(123456-1234567): ");

        Scanner scanner = new Scanner(System.in);
        String regNum = scanner.nextLine();

        char gender = regNum.charAt(7);
        switch (gender) {
            case '1': case '3':
                switch (gender) { //switch문은 중첩해서 사용할 수 있다. -> break문 작성에 주의해야한다.
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                        //break //내부 switch문의 마지막 case문: break가 불필요하다.
                }
                break; //외부 switch문의 case를 구분해준다. -> 반드시 필요하다.
            case '2': case '4':
                switch (gender) {
                    case '2':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                        break;
                    case '4':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                }
                break; //필수
            default:
                System.out.println("존재하지 않는 주민번호입니다.");
        }
    }

}
