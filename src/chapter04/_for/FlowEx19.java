package chapter04._for;

public class FlowEx19 {

    public static void main(String[] args) {
        //괄호 없이 간단하게 표현할 수 있다.
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                for (int k = 1; k <= 3; k++)
                    System.out.println("" + i + j + k); //제일 먼저 문자열을 더해줘 전체 연산 결과가 문자열이 되도록 한다.
    }

}
