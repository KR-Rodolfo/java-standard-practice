package chapter04.name;

import java.util.Scanner;

public class FlowEx34 {

    public static void main(String[] args) {
        int menu;
        int target;

        Scanner scanner = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요(종료: 0): ");
            menu = Integer.parseInt(scanner.nextLine());

            if (menu == 0) { //탈출 조건
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            for (; ; ) { //무한 반복
                System.out.println("계산할 값을 입력하세요(계산 종료: 0, 전체 종료: 99).");
                target = Integer.parseInt(scanner.nextLine());

                //탈출 조건
                if (target == 99) { 
                    System.out.println("프로그램을 종료합니다.");
                    break outer; //outer 반복문을 탈출한다.
                } else if (target == 0) {
                    System.out.println("계산을 종료합니다.");
                    break; //인접한 반복문을 탈출한다.
                }

                //menu는 외부 반복문에서 필터링 되기 때문에 무조건 1, 2, 3 중 하나이다.
                switch (menu) {
                    case 1:
                        System.out.println("result = " + (target * target));
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(target));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(target));
                }
            }
        }
    }

}
