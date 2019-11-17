package com.epam.practice9_homework;

public class Card {
    private Suit suitType;
    private Rank rankType;


    public Card(Suit suitType, Rank rankType) {
        this.suitType = suitType;
        this.rankType = rankType;
    }

    @Override
    public String toString() {
        return "Card: " +
                "suitType = " + suitType +
                ", rankType = " + rankType;
    }

}
