package chapter09.wrapper;

public class WrapperEx2 {

    public static void main(String[] args) {
        int i1 = new Integer(100).intValue();
        int i2 = Integer.parseInt("100");
        Integer i3 = Integer.valueOf("100");

        //진법으로 해석 가능
        int i4 = Integer.parseInt("100", 2);
        int i5 = Integer.parseInt("100", 8);
        int i6 = Integer.parseInt("100", 16);
        int i7 = Integer.parseInt("FF", 16); //URL 처리할 때 사용한다.
        //int i8 = Integer.parseInt("FF"); //진법을 명시하지 않을 경우 10진수로 해석 -> NumberFormatException 발생

        Integer i9 = Integer.valueOf("100", 2);
        Integer i10 = Integer.valueOf("100", 8);
        Integer i11 = Integer.valueOf("100", 16);
        Integer i12 = Integer.valueOf("FF", 16);
        //Integer i13 = Integer.valueOf("FF"); //NumberFormatException

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("i5 = " + i5);
        System.out.println("i6 = " + i6);
        System.out.println("i7 = " + i7);
        System.out.println("i9 = " + i9);
        System.out.println("i10 = " + i10);
        System.out.println("i11 = " + i11);
        System.out.println("i12 = " + i12);
    }

}
