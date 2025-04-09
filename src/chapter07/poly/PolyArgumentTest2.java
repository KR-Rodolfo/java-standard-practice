package chapter07.poly;

public class PolyArgumentTest2 {

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

    static class Audio extends Product {
        public Audio() {
            super(50);
        }

        @Override
        public String toString() {
            return "Audio";
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
        static final int CAPACITY_OF_CART = 10;

        int money = 1000;
        int bonusPoints;
        Product[] cart = new Product[CAPACITY_OF_CART]; //다형성 덕분에 여러가지 종류의 참조 변수를 단일 타입 참조변수 배열에 저장할 수 있다.
        int cnt = 0;

        public void buy(Product product) {
            if (cnt >= CAPACITY_OF_CART) {
                System.out.println("장바구니가 가득 찼습니다.");
                return;
            }

            if (money < product.price) {
                System.out.println("잔액이 부족합니다.");
                return;
            }

            money -= product.price;
            bonusPoints += product.bonusPoints;
            cart[cnt++] = product;
            System.out.println(product + "을/를 구입하셨습니다.");
        }

        public void summary() {
            int totalPrice = 0;
            String itemList = "";

            for (int i = 0; i < CAPACITY_OF_CART; i++) {
                if (cart[i] == null) {
                    break;
                }
                totalPrice += cart[i].price;
                itemList += (i == 0) ? cart[i] : ", " + cart[i];
            }

            System.out.println("구입하신 물품의 총금액은 " + totalPrice + "원 입니다.");
            System.out.println("구입하신 제품은 " + itemList + "입니다.");
        }
    }

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv());
        buyer.buy(new Audio());
        buyer.buy(new Computer());

        buyer.summary();
    }

}
