package chapter07.poly;

public class CastingTest1 {

    public static void main(String[] args) {
        Car car = null;
        FireCar fireCar1 = new FireCar();
        FireCar fireCar2 = new FireCar();

        fireCar1.water();

        car = fireCar1;
        //car.water() //Car 타입 참조변수는 water 메서드를 찾지 못한다.

        fireCar2 = (FireCar) car; // car는 fireCar1 객체이므로 다운 캐스팅이 가능하다.
        fireCar2.water();
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
