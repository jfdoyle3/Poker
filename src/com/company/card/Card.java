package com.company.card;

public abstract class Card {

    protected boolean faceDown;

    public Card(boolean faceDown) {
        this.faceDown = faceDown;
    }

    public abstract void flip();

}