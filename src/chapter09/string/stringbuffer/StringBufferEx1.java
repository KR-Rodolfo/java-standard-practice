package chapter09.string.stringbuffer;

public class StringBufferEx1 {

    public static void main(String[] args) {
        //StringBuffer: 가변 문자열
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println(sb1 == sb2); //false
        System.out.println(sb1.equals(sb2)); //StringBuffer 클래스는 내부에 equals 메서드를 구현하지 않는다.

        //StringBuffer -> String 변환
        String str1 = sb1.toString();
        String str2 = sb2.toString();

        System.out.println(str1.equals(str2)); //String 클래스는 equals 메서드를 오버라이딩 한다.
    }

}
