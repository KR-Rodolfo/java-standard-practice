package chapter09.wrapper;

public class WrapperEx1 {

    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);

        System.out.println(i == i2); //true -> 내부에 100을 가지는 Integer를 미리 생성한다.
        System.out.println(i.equals(i2)); //true
        System.out.println(i.compareTo(i2)); //0
        System.out.println(i.toString()); //100

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE); //bits
        System.out.println(Integer.BYTES); //bytes
        System.out.println(Integer.TYPE); //int
    }

}
