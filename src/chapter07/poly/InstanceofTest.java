package chapter07.poly;

public class InstanceofTest {

    public static void main(String[] args) {
        FireCar fireCar = new FireCar();

        if (fireCar instanceof FireCar) {
            System.out.println("This is a FireCar instance");
        }

        if (fireCar instanceof Car) {
            System.out.println("This is a Car instance");
        }

        if (fireCar instanceof Object) {
            System.out.println("This is a Object instance");
        }
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
