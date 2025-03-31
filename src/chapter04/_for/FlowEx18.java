package chapter04._for;

public class FlowEx18 {

    public static void main(String[] args) {
       //중첩 반복문을 이용해 구구단을 출력한다.
        for (int i = 2; i <= 9; i++) {
            System.out.println("[" + i + "단 시작" +"]");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
