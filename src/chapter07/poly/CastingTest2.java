package chapter07.poly;

public class CastingTest2 {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = null;
        FireCar fireCar = null;

        car1.drive();
    //    fireCar = (FireCar) car1; //런타임 예외 -> 인스턴스 내부에 FireCar 요소가 존재하지 않는다.
    //    fireCar.drive();
    //    car2 = fireCar;
    //    car2.drive();
    }

    static class Car {
        String color;
        int door;

        void drive() {
            System.out.println("drive!!");
        }

        void stop() {
            System.out.println("stop");
        }
    }

    static class FireCar extends Car {
        void water() {
            System.out.println("water");
        }
    }

}
