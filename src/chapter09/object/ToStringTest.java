package chapter09.object;

import java.util.Date;

public class ToStringTest {

    public static void main(String[] args) {
        String str = new String("KOREA");
        Date today = new Date();

        //String 과 Date 클래스는 내부에 toString()이 오버라이딩 되어 있다.
        System.out.println(str);
        System.out.println(str.toString()); //println 메서드는 내부에서 toString()을 호출한다.
        System.out.println(today);
        System.out.println(today.toString());
    }

}
