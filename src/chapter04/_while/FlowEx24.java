package chapter04._while;

public class FlowEx24 {

    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);
            for (int j = 0; j < 2_000_000_000; j++) {
                //시간을 지연시키기 위한 반복
            }
        }

        System.out.println("GAME OVER");
    }

}
