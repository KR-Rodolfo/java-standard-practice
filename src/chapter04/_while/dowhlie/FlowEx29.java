package chapter04._while.dowhlie;

public class FlowEx29 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print("i = " + i);

            int tmp = i;

            //일의 자리를 분리한 뒤 3의 배수인지 확인한다.
            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);

            System.out.println();
        }
    }
    
}
