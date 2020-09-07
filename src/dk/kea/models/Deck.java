package dk.kea.models;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private int total;
    private ArrayList<Card> cards;
    private Random random;

    public Deck(int suits, int numbers) {
        this.cards = new ArrayList<>();
        for (int i = 1; i <= suits; i++){
            for(int j = 1; j <= numbers; j ++){
                cards.add(new Card(i,j));
                this.total ++;
            }
        }
        this.random = new Random();
    }

    public Deck() {
        this.cards = new ArrayList<>();
        for (int i = 1; i <= 4; i++){
            for(int j = 1; j <= 13; j ++){
                cards.add(new Card(i,j));
                this.total ++;
            }
        }
        this.random = new Random();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
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
            int index = random.nextInt(this.cards.size());
            result = this.cards.get(index);
            this.cards.remove(index);
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
