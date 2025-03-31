package chapter04._while;

import java.util.Scanner;

public class FlowEx27 {

    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.print(">>");
            String tmp = scanner.nextLine();

            num = Integer.parseInt(tmp);
            if (num != 0) {
                sum += num;
            } else {
                flag = false; //flag를 이용해 동적으로 반복문을 탈출할 수 있다.
            }
        }

        System.out.println("합계:" + sum);
    }

}
