package chapter09.object;

public class CardToString2 {

    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        //오버라이딩된 toString() 메서드를 실행한다.
        System.out.println(c1);
        System.out.println(c2);
    }

    static class Card {
        String kind;
        int number;

        public Card() {
            this("SPADE", 1);
        }

        public Card(String kind, int number) {
            this.kind = kind;
            this.number = number;
        }

        @Override
        public String toString() {
            return "kind: " + kind + ", number: " + number;
        }
    }

}
