package dk.kea.models;

import dk.kea.enums.RANK;
import dk.kea.enums.SUIT;

public class Card implements Comparable<Card>{
    private SUIT suit;
    private RANK number;

    public Card(SUIT suit, RANK number) {
        this.suit = suit;
        this.number = number;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    public void setNumber(RANK number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return this.suit + " " + this.number;
    }

    @Override
    public int compareTo(Card o) {
        if(this.number != o.number){
            return this.number.compareTo(o.number);
        }else
        {
            return this.suit.compareTo(o.suit);
        }
    }
}
