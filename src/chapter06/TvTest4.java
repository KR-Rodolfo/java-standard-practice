package chapter06;

class Tv4 {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvTest4 {

    public static void main(String[] args) {
        //참조 변수들을 저장하는 객체 배열도 생성 가능하다.
        Tv4[] tvArr = new Tv4[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv4();
            tvArr[i].channel = 10 + i;
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d\n", i, tvArr[i].channel);
        }
    }

}
