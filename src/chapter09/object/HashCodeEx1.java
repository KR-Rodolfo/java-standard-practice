package chapter09.object;

public class HashCodeEx1 {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        //String 클래스에는 이미 hashcode() 메서드가 오버라이딩 되어있다.
        System.out.println(str1.hashCode());
        System.out.println(str1.hashCode());

        //참조값으로 hashcode 생성
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }

}
