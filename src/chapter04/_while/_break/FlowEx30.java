package chapter04._while._break;

public class FlowEx30 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) { //무한 반복문이기 때문에 아래와 같이 탈출 조건이 필요하다.
            if (sum > 100) {
                break; //바로 인접한 반복문을 탈출한다.
            }
            i++;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }

}
