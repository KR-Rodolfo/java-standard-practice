package chapter04._while;

import java.util.Scanner;

public class FlowEx25 {

    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요(예: 12345): ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num % 10; //나머지를 분리한 뒤 sum에 더한다.
            System.out.println("sum=" + sum + " num=" + num);
            num /= 10; //앞선 과정에서 자리수를 더해줬기 때문에 num에서 1의 자리를 분리해준다.
        }

        System.out.println("각 자리수의 합:" + sum);
    }

}
