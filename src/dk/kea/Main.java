package dk.kea;

import dk.kea.controller.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("Jarl","Asger");
        game.play();
        game.getWinner();
    }
}
