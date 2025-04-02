package chapter06;

class Tv {
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

public class TvTest {

    public static void main(String[] args) {
        Tv t;
        t = new Tv(); //new: 생성한 객체의 참조값을 반환한다.
        t.channel = 7; //참조값으로 이동한 뒤 channel 변수를 가져온다.
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "번 입니다.");
    }

}
