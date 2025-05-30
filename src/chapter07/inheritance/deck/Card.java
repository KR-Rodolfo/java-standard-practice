package chapter07.inheritance.deck;

public class Card {

    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 0);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String[] numbers = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

        return "kind: " + kinds[this.kind] + ", number: " + numbers[this.number];
    }

}
