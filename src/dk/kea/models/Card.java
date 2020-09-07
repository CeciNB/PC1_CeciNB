package dk.kea.models;

import dk.kea.enums.COLOR;

public class Card implements Comparable<Card>{
    COLOR color;
    char suit;
    int s;
    int number;
    String symbol;

    public Card(int suit, int number) {
        this.s = suit;
        switch (suit) {
            case 1:
                this.suit = '♣';
                this.color = COLOR.BLACK;
                break;
            case 2:
                this.suit = '♦';
                this.color = COLOR.RED;
                break;
            case 3:
                this.suit = '♥';
                this.color = COLOR.RED;
                break;
            case 4:
                this.suit = '♠';
                this.color = COLOR.BLACK;
                break;
            default:
                this.suit = 'U';
                this.color = COLOR.OTHER;
        }
        switch (number){
            case 1:
                this.symbol = "A";
                this.number = number;
                break;
            case 11:
                this.symbol = "J";
                this.number = number;
                break;
            case 12:
                this.symbol = "Q";
                this.number = number;
                break;
            case 13:
                this.symbol = "K";
                this.number = number;
                break;
            default:
                this.symbol = Integer.toString(number);
                this.number = number;

        }
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return  "--------- \n" +
                "|" + symbol + "      |\n" +
                "|" + suit + "      |\n" +
                "|       |\n" +
                "|      " + suit + "|\n" +
                "|      " + symbol + "|\n" +
                "---------\n" ;
    }

    @Override
    public int compareTo(Card o) {
        if(this.number != o.number){
            return this.number - o.number;
        }else
        {
            return this.s - o.s;
        }
    }
}
