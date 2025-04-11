package chapter09.object;

public class CardToString1 {

    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        //println() 메서드에서 toString()을 호출한다.
        //Object 클래스에 구현된 toString()은 주소값을 문자열로 반환한다.
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
    }

}
