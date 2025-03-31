package chapter04._while._continue;

public class FlowEx31 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) { //0과 3의 배수들을 필터링한다.
                continue; //인접한 반복문을 마지막으로 이동한다. -> 바로 다음 반복이 수행된다.
            }
            System.out.println(i);
        }
    }

}
