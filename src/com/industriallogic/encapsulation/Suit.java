package com.industriallogic.encapsulation;

public enum Suit {
    DIAMOND, SPADE, HEART, CLUB;

    public boolean compare(Suit suit){
       return this.ordinal() > suit.ordinal();
    }
}
