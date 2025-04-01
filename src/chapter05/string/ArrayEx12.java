package chapter05.string;

public class ArrayEx12 {

    public static void main(String[] args) {
        //문자열 배열
        String[] names = {"Kim", "Park", "Yi"};
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp = " + tmp);
        names[0] = "Yu"; //0번째 인덱스의 값 변경

        //향상된 for
        for (String name : names) {
            System.out.println(name);
        }
    }

}
