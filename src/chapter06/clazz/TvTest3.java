package chapter06.clazz;

class Tv3 {
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

public class TvTest3 {

    public static void main(String[] args) {
        Tv3 tv1 = new Tv3();
        Tv3 tv2 = new Tv3();

        System.out.println("tv1의 channel의 값은 " + tv1.channel + "번 입니다.");
        System.out.println("tv2의 channel의 값은 " + tv2.channel + "번 입니다.");

        tv2 = tv1; //tv1과 tv2는 같은 참조값을 저장한다.
        tv1.channel = 7; //tv2.channel의 값도 변경된다.

        System.out.println("tv1의 channel의 값은 " + tv1.channel + "번 입니다."); //7
        System.out.println("tv2의 channel의 값은 " + tv2.channel + "번 입니다."); //7
    }

}
