package dk.kea;

import dk.kea.controller.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("Cecilie","Nana");
        game.play();
        game.getWinner();
    }
}
