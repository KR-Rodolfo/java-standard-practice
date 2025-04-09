package chapter07.poly;

public class PolyArgumentTest1 {

    static class Product {
        int price;
        int bonusPoints;

        public Product(int price) {
            this.price = price;
            this.bonusPoints = (int) (price / 10.0);
        }
    }

    static class Tv extends Product {
        public Tv() {
            super(100);
        }

        @Override
        public String toString() {
            return "Tv";
        }
    }

    static class Computer extends Product {
        public Computer() {
            super(200);
        }

        @Override
        public String toString() {
            return "Computer";
        }
    }

    static class Buyer {
        int money = 1000;
        int bonusPoints;

        void buy(Product product) { //다형적 매개변수: Product의 자식 타입 참조변수를 모두 전달받을 수 있다.
            if (money < product.price) {
                System.out.println("잔액이 부족합니다.");
                return;
            }
            
            //정상 로직
            money -= product.price;
            bonusPoints += product.bonusPoints;
            System.out.println(product + "을/를 구입하셨습니다.");
        }
    }

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "원 입니다.");
        System.out.println("현재 보너스 포인트는 " + b.bonusPoints + "점 입니다.");
    }

}
