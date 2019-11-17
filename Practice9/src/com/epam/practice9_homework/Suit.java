package com.epam.practice9_homework;

public enum Suit {
    SPADE, DIAMOND, CLUB, HEART;
    public void viewSuit() {
        Suit[] suits = Suit.values();
        int index = ordinal();
        System.out.print(suits[index] + " ");
    }
}
