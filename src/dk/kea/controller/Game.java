package dk.kea.controller;
import dk.kea.models.Deck;
import dk.kea.models.Player;

public class Game {
    private Deck deck;
    private Player p1;
    private Player p2;

    public Game(String player1, String player2) {
        this.deck = new Deck();
        this.p1 = new Player(player1);
        this.p2 = new Player(player2);
    }

    public void play(){
        deck.shuffle();
        while(!deck.getCards().isEmpty()) {

            p1.setCard(deck.draw());
            p2.setCard(deck.draw());

            System.out.println(p1.getName() + ": " + p1.getCard());
            System.out.println(p2.getName() + ": " + p2.getCard());

            if(0 < p1.getCard().compareTo(p2.getCard())){
                p1.addScore(p1.getCard().compareTo(p2.getCard()));
            }
            else{
                p2.addScore(p2.getCard().compareTo(p1.getCard()));
            }
            System.out.println("Score: " + p1.getName() + ": " + p1.getScore() + " " + p2.getName() + ": " + p2.getScore() + "\n");
            assert (0 == p1.getCard().compareTo(p2.getCard())) : "IT'S A TIE - MISTAKE";
        }
    }

    public void getWinner(){
        if (p1.getScore()>p2.getScore())
            System.out.println("WINNER: " + p1.getName());
        else
            System.out.println("WINNER: " + p2.getName());
    }
}
