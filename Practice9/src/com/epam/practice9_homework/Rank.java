package com.epam.practice9_homework;

public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    public void viewRank() {
        Rank[] ranks = Rank.values();
        int index = ordinal();
        System.out.print(ranks[index] + " ");
    }
}
