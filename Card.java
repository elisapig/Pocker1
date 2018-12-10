package com.elisa.pocker;

public class Card {
    int value;
    char[] suits = {'\u2660', '\u2663', '\u2665', '\u2666'};

    public Card(int value) {
        this.value = value;
    }

    public String getCard() {
        switch (value % 13 + 1) {
            case 1:
                return suits[value / 13] + "  A";
            case 10:
                return suits[value / 13] + "" + (value % 13 + 1);
            case 11:
                return suits[value / 13] + "  J";
            case 12:
                return suits[value / 13] + "  Q";
            case 13:
                return suits[value / 13] + "  K";
            default:
                return suits[value / 13] + "  " + (value % 13 + 1);
        }
    }
}