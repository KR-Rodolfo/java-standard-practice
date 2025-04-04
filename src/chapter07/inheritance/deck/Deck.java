package chapter07.inheritance.deck;

import java.util.Arrays;
import java.util.Random;

public class Deck {

    private static final int CARD_NUM = 52;
    private Card[] cards = new Card[CARD_NUM];

    public Deck() {
        int cnt = 0;
        for (int i = 0; i < Card.KIND_MAX; i++) {
            for (int j = 0; j < Card.NUM_MAX; j++) {
                cards[cnt++] = new Card(i + 1, j + 1);
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int index = new Random().nextInt(CARD_NUM);
            Card tmp = cards[0];
            cards[i] = cards[index];
            cards[index] = tmp;
        }
    }

    public Card peek(int index) {
        return cards[index];
    }

}
