package chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitBoxEx4 {

    static class Fruit {
        String name;
        int weight;

        public Fruit(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return name + "(" + weight + ")";
        }
    }

    static class Apple extends Fruit {
        Apple(String name, int weight) {
            super(name, weight);
        }
    }

    static class Grape extends Fruit {
        Grape(String name, int weight) {
            super(name, weight);
        }
    }

    static class FruitComparator<T extends Fruit> implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            return o1.weight - o2.weight;
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

        ArrayList<T> getList() {
            return list;
        }

        int size() {
            return list.size();
        }

        @Override
        public String toString() {
            return list.toString();
        }
    }

    static class FruitBox<T extends Fruit> extends Box<T> {}

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new FruitComparator<>()); //타입 추론
        Collections.sort(grapeBox.getList(), new FruitComparator<>()); //타입 추론

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }

}
