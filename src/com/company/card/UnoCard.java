package com.company.card;

import com.company.deck.UnoColor;

public class UnoCard extends Card {

        private final int value;
        private final UnoColor color;

    public UnoCard(int value, UnoColor color) {
        super(value, color);
        this.value = value;
        this.color = color;
    }

//    public UnoCard(int value, UnoColor color) {
//        super(true);
//        this.value = value;
//        this.color = color;
//    }

    // Abstract method for getters on Value/Rank , Color/Suit????

    public int getValue() {
        return value;
    }

    public UnoColor getColor() {
        return color;
    }

    @Override
    public String display() {
        StringBuilder cardOutput=new StringBuilder();
        cardOutput.append(color).append(value).append(UnoColor.RESET);
        return  cardOutput.toString();
    }

    @Override
    public void flip() {

    }

    @Override
    public String toString() {
        StringBuilder cardOutput=new StringBuilder();
        cardOutput.append(color).append(value).append(UnoColor.RESET);
        return  cardOutput.toString();
               // color+UnoColor.RESET;
    }

    //    public String toString() {
//        String output = switch (value) {
//            case 1 -> "A";
//            case 11 -> "J";
//            case 12 -> "Q";
//            case 13 -> "K";
//            default -> value == 10 ? Integer.toString(value) : "" + value;
//        };
//        return output + color;
//
}
