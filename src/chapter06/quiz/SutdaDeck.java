package chapter06.quiz;

public class SutdaDeck {

    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard(i + 1, true);
            } else {
                cards[i] = new SutdaCard((i % 10) + 1, false);
            }
        }
    }

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int randomIndex = (int) (Math.random() * CARD_NUM);
            SutdaCard tmp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        return cards[(int) (Math.random() * CARD_NUM)];
    }

    static class SutdaCard {
        final int num;
        final boolean isKwang;

        SutdaCard() {
            this(1, true);
        }

        SutdaCard(int num, boolean isKwang) {
            this.num = num;
            this.isKwang = isKwang;
        }

        @Override
        public String toString() {
            return num + (isKwang ? "K" : "");
        }
    }

    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }

}
