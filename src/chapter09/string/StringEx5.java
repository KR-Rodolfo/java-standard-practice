package chapter09.string;

public class StringEx5 {

    public static void main(String[] args) {
        String fullName = "Hello.java";

        //특정 문자열의 위치를 반환한다.
        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);
        String ext = fullName.substring(index + 1);

        System.out.println("파일 이름: " + fileName);
        System.out.println("확장자: " + ext);
    }

}
