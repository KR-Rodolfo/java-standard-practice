package chapter12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx3 {

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

    static class Juice {
        String name;

        Juice(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Juicer {
        static Juice makeJuice(FruitBox<? extends Fruit> box) {
            String tmp = "";
            for (Fruit f : box.getList()) {
                tmp += f + " ";
            }
            return new Juice(tmp);
        }
    }

    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(grapeBox));
    }

}
