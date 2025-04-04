package chapter07.inheritance;

public class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

class CaptionTv extends Tv { //Tv 클래스의 멤버 변수를 상속 받는다.
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class CaptionTvTest {

    public static void main(String[] args) {
        CaptionTv captionTv = new CaptionTv(); //captionTv 인스턴스 내부에는 부모의 필드와 자식을 필드가 모두 존재한다.
        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println(captionTv.channel);

        captionTv.displayCaption("Hello World");
        captionTv.caption = true;
        captionTv.displayCaption("Hello World");
    }

}
