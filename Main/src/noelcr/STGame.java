package noelcr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class STGame {
    private static final int NUM_CARDS_DEALT = 8;
    public static STGame currentGame;
    private int numPlayers;
    private int dealerNum;
    private Player[] players;
    private Deck deck;
    int yourPlayerId;


    public STGame(int numPlayers){
        this.numPlayers = numPlayers;
        deck = new Deck();

        currentGame = this;
    }

    public void selectDealer() {
        //int dealerNum = new Random().nextInt(2);
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


                if (players[i] == players[yourPlayerId]){
                    System.out.println("It is your turn, please select a card , 1>8 ->");
                    Scanner opt = new Scanner(System.in);
                    int cardChoice = opt.nextInt();
                    System.out.println(cardChoice);
                    System.out.println("your turn is over");

                }
                //System.out.println(players[i]);
                //add compare card - using players[i]
                gameIsOn = false;
                //todo: check if human player, if bot = play, if human = get input
            }


        }

    }

    public boolean validCardToPlay(Card cards) {
        return false;

    }

    public void playCard(Card cards) {

    }
}

