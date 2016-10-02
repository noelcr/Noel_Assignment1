package noelcr;

import java.util.ArrayList;
import java.util.Random;

public class STGame {
    private static final int NUM_CARDS_DEALT = 60;
    private int numPlayers;
    private int dealerNum;
    private Player[] players;
    private Deck deck;


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
            players[i] = new Player("PlayerIdx" +i);
        }

        for (Player player : players) {
            ArrayList<Card> cards = deck.dealCards(NUM_CARDS_DEALT);
            player.setCards(cards);

        }



    }
}

