package chapter04._for;

public class FlowEx14 {

    public static void main(String[] args) {
        for (int i = 1, j = 10; i <= 10; i++, j--) { //초기식에 변수를 둘 이상 선언할 수 있다.
            System.out.println(i + " \t " + j);
            System.out.println(i + " \t " + (11 - i));
        }
    }

}
