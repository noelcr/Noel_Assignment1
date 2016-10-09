package noelcr;

import java.util.Scanner;

public class mainA1 {
    private static final int N_GAME = 1;

    public static void main(String[] args) {
        displayWelcome();
        displayMenu();
        int userChoice = getUserChoice();
        STGame game;
        if (userChoice == N_GAME) {
            game = startNewGame();
            game.playGame();
        }
    }

    private static STGame startNewGame() {
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealRandomCardsToEachPlayer();
        game.selectYouAsPlayer();
        Player humanPlayer = game.getHumanPlayer();
        showPlayer(humanPlayer);
        return game;
    }

    private static void showPlayer(Player humanPlayer) {
        System.out.println("human Player= " + humanPlayer);
    }

    private static int getNumPlayers() {
        System.out.println("please choose how many players (3-5): ");
        Scanner opt = new Scanner(System.in);
        int userChoiceOfNumPlayers = opt.nextInt();
        return userChoiceOfNumPlayers;
    }

    private static int getUserChoice() {
        Scanner opt = new Scanner(System.in);
        int userMenuChoice = opt.nextInt();
        return userMenuChoice;

    }

    private static void displayMenu() {
        System.out.println("1. Start the game.");
        System.out.println("2. Exit.");
        System.out.println("> ");
    }

    private static void displayWelcome() {
        System.out.println("welcome to the game");
    }

}
