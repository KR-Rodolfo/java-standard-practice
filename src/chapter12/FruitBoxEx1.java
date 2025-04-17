package chapter12;

import java.util.ArrayList;

public class FruitBoxEx1 {

    static class Fruit {
        @Override
        public String toString() {
            return "Fruit";
        }
    }

    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "Apple";
        }
    }

    static class Grape extends Fruit {
        @Override
        public String toString() {
            return "Grape";
        }
    }

    static class Toy {
        @Override
        public String toString() {
            return "Toy";
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

    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();

        //타입 인자는 양쪽이 항상 같아야한다.
        //Box<Grape> grapeBox = new Box<Apple>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy()); //타입 에러
        
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); //다형성 적용

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }

}
