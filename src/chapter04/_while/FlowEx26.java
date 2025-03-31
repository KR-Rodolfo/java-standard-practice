package chapter04._while;

public class FlowEx26 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100) {
            //1. 전위 증감 연산자로 인해 i가 증가한다.
            //2. 증감된 i가 sum에 누적된다.
            //3. sum <= 100 조건식을 실행한다.
            System.out.println(i + " - " + sum);
        }
    }

}
