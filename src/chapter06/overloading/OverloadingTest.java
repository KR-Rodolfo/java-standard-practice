package chapter06.overloading;

public class OverloadingTest {

    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3, 3));;
        System.out.println(mm.add(3, 3L));;
        System.out.println(mm.add(3L, 3));;
        System.out.println(mm.add(3L, 3L));;
        System.out.println(mm.add(new int[]{1, 2, 3, 4, 5}));;

    }

    /**
     * 오버로딩 조건
     * 1. 매개변수의 타입 또는 개수 또는 순서가 달라야한다.
     * 2. 메서드명이 동일해야 한다.
     */
    static class MyMath3 {
        int add(int a, int b) {
            System.out.println("MyMath3.add(int a, int b)");
            return a + b;
        }

        long add(int a, long b) {
            System.out.println("MyMath3.add(int a, long b)");
            return a + b;
        }

        long add(long a, int b) {
            System.out.println("MyMath3.add(long a, int b)");

            return a + b;
        }

        long add(long a, long b) {
            System.out.println("MyMath3.add(long a, long b)");
            return a + b;
        }

        int add(int[] a) {
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i];
            }
            return result;
        }
    }

}
