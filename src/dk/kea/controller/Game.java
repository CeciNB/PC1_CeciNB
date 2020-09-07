package dk.kea.controller;
import dk.kea.models.Deck;
import dk.kea.models.Player;

public class Game {
    private Deck deck;
    private Player p1;
    private Player p2;
    private int maxRounds;

    public Game(String player1, String player2) {
        this.deck = new Deck();
        this.p1 = new Player(player1);
        this.p2 = new Player(player2);
    }

    public void play(){
        deck.shuffle();
        while(!deck.getCards().isEmpty() || maxRounds < 26) {
            p1.setCard(deck.draw());
            p2.setCard(deck.draw());
            System.out.println(p1.getCard() + " " + p2.getCard());
            if(0 < p1.getCard().compareTo(p2.getCard())){
                p1.addScore(1);
                maxRounds ++;
                System.out.println(p1.getName() + " " + p1.getScore() + " " + p2.getName() + " " + p2.getScore());
            }
            else if(0 == p1.getCard().compareTo(p2.getCard())){
                maxRounds ++;
                System.out.println("tie");
            }
            else{
                p2.addScore(1);
                maxRounds ++;
                System.out.println(p1.getName() + " " + p1.getScore() + " " + p2.getName() + " " + p2.getScore());
            }
        }
    }

    public void getWinner(){
        if (p1.getScore()>p2.getScore())
            System.out.println("WINNER: " + p1.getName());
        else
            System.out.println("WINNER: " + p2.getName());
    }
}
