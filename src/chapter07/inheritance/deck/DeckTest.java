package chapter07.inheritance.deck;

public class DeckTest {

    public static void main(String[] args) {
        Deck d = new Deck();
        Card card = d.peek(0);
        System.out.println(card);

        d.shuffle();
        card = d.peek(0);
        System.out.println(card);
    }

}
