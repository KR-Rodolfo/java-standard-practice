package chapter06.clazz;

class Tv2 {
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

public class TvTest2 {

    public static void main(String[] args) {
        //동일한 클래스를 통해 인스턴스를 생성해도 두 인스턴스는 독립적인 메모리에 존재한다.
        Tv2 tv1 = new Tv2();
        Tv2 tv2 = new Tv2();

        System.out.println("tv1의 channel의 값은 " + tv1.channel + "번 입니다.");
        System.out.println("tv2의 channel의 값은 " + tv2.channel + "번 입니다.");

        tv1.channel = 7;
        System.out.println("tv1의 channel의 값은 " + tv1.channel + "번 입니다.");

        System.out.println("tv1의 channel의 값은 " + tv1.channel + "번 입니다.");
        System.out.println("tv2의 channel의 값은 " + tv2.channel + "번 입니다.");
    }

}
