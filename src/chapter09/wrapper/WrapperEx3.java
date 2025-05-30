package chapter09.wrapper;

public class WrapperEx3 {

    public static void main(String[] args) {
        int i = 10;
        
        //오토 박싱 가능
        Integer intg = (Integer) i;
        Object obj = (Object) i;

        //오토 박싱
        Long lng = 100L;

        //intg가 오토 언박싱 된 다음 + 10 연산 실행
        int i2 = intg + 10;
        //
        long l = intg + lng;

        Integer intg2 = new Integer(20);
        int i3 = (int) intg2;

        Integer intg3 = intg2 + i3;

        System.out.println("i = " + i);
        System.out.println("intg = " + intg);
        System.out.println("obj = " + obj);
        System.out.println("lng = " + lng);
        System.out.println("i2 = " + i2);
        System.out.println("l = " + l);
        System.out.println("i3 = " + i3);
        System.out.println("intg3 = " + intg3);
    }

}
