package com.elisa.pocker;

import java.util.Random;

public class Pocker {

    Card[] cards = new Card[52];

    public Pocker() {
        for (int i = 0; i < 52; i++) {
            cards[i] = new Card(i);
        }
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int r = new Random().nextInt(52);
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

    public void print() {
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i].getCard());
            if (i % 13 == 12) {
                System.out.println();
            }
        }
    }
}