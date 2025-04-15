package chapter09.random;

import java.util.Random;

public class RandomEx1 {

    public static void main(String[] args) {
        //seed값이 같기 때문에 두 Random 인스턴스가 생성하는 난수는 같다.
        Random rand1 = new Random(1);
        Random rand2 = new Random(1);

        for (int i = 0; i < 5; i++) {
            System.out.println(rand1.nextInt());
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(rand2.nextInt());
        }
    }

}
