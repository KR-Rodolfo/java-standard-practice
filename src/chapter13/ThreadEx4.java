package chapter13;

public class ThreadEx4 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long k = 0;
        for (int i = 0; i < 300000000L; i++) {
            k += i;
        }

        for (int i = 0; i < 300000000L; i++) {
            k += i;
        }
        System.out.println(k);
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
