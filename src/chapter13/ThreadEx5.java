package chapter13;


public class ThreadEx5 {

    public static void main(String[] args) throws InterruptedException {
        ThreadEx5_1 t1 = new ThreadEx5_1();

        long startTime = System.currentTimeMillis();
        t1.start();

        long k = 0;
        for (int i = 0; i < 300000000L; i++) {
            k += 1;
        }

        t1.join();
        System.out.println(k);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    static class ThreadEx5_1 extends Thread {
        @Override
        public void run() {
            long k = 0;
            for (int i = 0; i < 300000000L; i++) {
                k += i;
            }
            System.out.println(k);
        }
    }

}
