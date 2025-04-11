package chapter09.string;

import java.util.StringJoiner;

public class StringEx3 {

    public static void main(String[] args) {
        //String은 불변 객체이기 때문에 원본에 영향을 끼치지 못한다.
        String animal = "dog,cat,bear";
        String[] arr = animal.split(","); //regex 기준으로 문자열 분할

        System.out.println(animal);

        String joined = String.join("-", arr); //문자열 결합
        System.out.println(joined);

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String s : arr) {
            sj.add(s);
        }

        System.out.println(sj);
    }

}
