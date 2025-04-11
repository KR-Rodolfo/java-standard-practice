package chapter09.string;

public class StringEx1 {

    public static void main(String[] args) {
        //"abc" 문자열 리터럴은 JVM의 문자열 풀에서 공유된다.
        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2));

        System.out.println();

        //new String()으로 문자열 객체 생성 시 문자열 풀에 있는 인스턴스를 공유하지 않고 직접 새로운 인스턴스를 생성한다.
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4));
    }

}
