package noelcr;

import java.util.ArrayList;
import java.util.Random;

public class STGame {
    private static final int NUM_CARDS_DEALT = 8;
    private int numPlayers;
    private int dealerNum;
    private Player[] players;
    private Deck deck;
    int yourPlayerId;


    public STGame(int numPlayers){
        this.numPlayers = numPlayers;
        deck = new Deck();
    }

    public void selectDealer() {
        //todo: google how to get random int
        int i = new Random().nextInt(2);
        dealerNum = 1;
    }

    public void dealRandomCardsToEachPlayer() {
        players = new Player[numPlayers];

        for (int i = 0; i < numPlayers; i++){
            players[i] = new Player("playerID " +i);
        }

        for (Player player : players) {
            ArrayList<Card> cards = deck.dealCards(NUM_CARDS_DEALT);
            player.setCards(cards);
        }

    }

    public void selectYouAsPlayer() {
        //todo: can be random
        int yourPlayerId = 1;
    }

    public Player getHumanPlayer() {
        return players[yourPlayerId];

    }

    public void playGame() {
        boolean gameIsOn = true;
        while (gameIsOn){





            //todo: set up players in correct order(loop?)
            //showPlayerTurn();


            for (int i = 0; i < players.length; i++) {
                //whoever is zero starts -
                System.out.println(players[i]);
                gameIsOn = false;








                //todo: check if human player, if bot = play, if human = get input
            }


        }

    }
}

