package com.epam.practice9_homework;

public class Main {

    public static void main(String[] args) {

        printSuitRank();
        CardPackage cards = new CardPackage();
        cards.formCardPack();
        cards.printCardPackage();
    }

    public static void printSuitRank() {
        System.out.println("Class Suit: ");
        for (Suit suitCard : Suit.values()) {
            switch (suitCard) {
                case SPADE: case CLUB: case HEART: case DIAMOND:
                    suitCard.viewSuit();
            }
        }
        System.out.println();
        System.out.println("Class Rank: ");
        for (Rank rankCard : Rank.values()) {
            switch (rankCard) {
                case ACE: case TWO: case THREE: case FOUR: case FIVE: case SIX: case SEVEN:
                case EIGHT: case NINE: case TEN: case JACK: case QUEEN: case KING:
                    rankCard.viewRank();
            }
        }
    }
}
