package com.industriallogic.encapsulation;

public enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

    public boolean compare(Rank otherCard){
        return this.ordinal() > otherCard.ordinal();
    }
}
