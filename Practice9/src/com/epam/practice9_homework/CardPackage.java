package com.epam.practice9_homework;

public class CardPackage {
    public Card[] arrayOfCards;
    static final int INDEX = 4*13;
    private int counter = 0;
    Card[] cardsPack = new Card[INDEX];

    public void addOneCard(Card newCard) {
        if (counter < cardsPack.length) {
            cardsPack[counter++] = newCard;
        }
    }

    public void formCardPack() {
        for (Suit suitCard : Suit.values()) {
            switch (suitCard) {
                case SPADE:
                case CLUB:
                case HEART:
                case DIAMOND: {
                    for (Rank rankCard : Rank.values()) {
                        switch (rankCard) {
                            case ACE:
                            case TWO:
                            case THREE:
                            case FOUR:
                            case FIVE:
                            case SIX:
                            case SEVEN:
                            case EIGHT:
                            case NINE:
                            case TEN:
                            case JACK:
                            case QUEEN:
                            case KING: {
                                addOneCard(new Card(suitCard, rankCard));
                            }
                        }

                    }
                }
            }
        }
    }

    public void printCardPackage() {
        System.out.println("Card Package: ");
        for (int i = 0; i < counter; i++) {
            System.out.println("Card [" + i + "] " + cardsPack[i]);
        }
    }
}
