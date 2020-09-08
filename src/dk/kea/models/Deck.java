package dk.kea.models;


import dk.kea.enums.RANK;
import dk.kea.enums.SUIT;

import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Deck {

    private int total;
    private Stack<Card> cards;
    private Random random;

    public Deck() {
        this.cards = new Stack<>();
        for(SUIT suit : SUIT.values())
            for(RANK rank : RANK.values()){
                cards.push(new Card(suit,rank));
            }

    }

    public Stack<Card> getCards() {
        return cards;
    }

    public void setCards(Stack<Card> cards) {
        this.cards = cards;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void shuffle (){
        Collections.shuffle(cards);
    }

    public Card draw(){
        Card result = null;
        if(!this.cards.isEmpty()) {
            result = cards.pop();
        }
        else{
            System.out.println("EMPTY");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Deck{" +
                ", cards=" + cards +
                '}';
    }
}
