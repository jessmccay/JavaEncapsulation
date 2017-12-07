package com.industriallogic.encapsulation;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){

        this.rank = rank;
        this.suit = suit;
    }

    public boolean compare(Card card) {
        if(rank.equals(card.rank)){
            return suit.compare(card.suit);
        }
        return rank.compare(card.rank);
    }
}