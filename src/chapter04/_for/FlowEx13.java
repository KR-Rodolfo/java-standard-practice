package chapter04._for;

public class FlowEx13 {

    public static void main(String[] args) {
        int sum = 0;

        //1부터 10까지의 수를 sum에 누적하여 합산한다.
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("1부터 " + i + "까지의 합: " + sum);
        }
    }

}
