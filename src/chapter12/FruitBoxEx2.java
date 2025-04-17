package chapter12;

import java.util.ArrayList;

public class FruitBoxEx2 {

    static interface Eatable {}

    static class Fruit implements Eatable {
        @Override
        public String toString() {
            return "fruit";
        }
    }

    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "apple";
        }
    }

    static class Grape extends Fruit {
        @Override
        public String toString() {
            return "grape";
        }
    }

    static class Toy {
        @Override
        public String toString() {
            return "toy";
        }
    }

    static class Box<T> {
        ArrayList<T> list = new ArrayList<>();

        void add(T item) {
            list.add(item);
        }

        T get(int i) {
            return list.get(i);
        }

        int size() {
            return list.size();
        }

        @Override
        public String toString() {
            return list.toString();
        }
    }

    static class FruitBox<T extends Fruit & Eatable> extends Box<T> {} //타입의 교집합, 제네릭 타입 매개변수의 상한

    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();


        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());

        grapeBox.add(new Grape());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }

}
