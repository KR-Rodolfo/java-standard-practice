package chapter04.name;

public class FlowEx33 {

    public static void main(String[] args) {
        Loop1: //반복문의 이름을 지정한다.
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1; //Loop1 이름을 가진 반복문을 탈출한다.
                    // continue Loop1; //Loop1 이름을 가진 반복문을 재수행한다.
                }
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }

}
