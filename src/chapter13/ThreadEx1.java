package chapter13;

public class ThreadEx1 {

    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        //두 쓰레드간의 실행 순서는 알 수 없다.
        //start() 실행 시 쓰레드가 run 메서드를 실행한다.
        t1.start();
        t2.start();
    }

    static class ThreadEx1_1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName());
            }
        }
    }

    static class ThreadEx1_2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

}
