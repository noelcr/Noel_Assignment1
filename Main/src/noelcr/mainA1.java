package noelcr;

/**
 * Created by Noel on 26/09/2016.
 */
public class mainA1 {
    private static final int N_GAME = 1;

    public static void main(String[] args) {
        System.out.println("Hello player");
        displayWelcome();
        displayMenu();
        int userChoice = getUserChoice();
        STGame game;
        if(userChoice == N_GAME){
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
        //game.showHumanPlayerCards();
        showPlayer(humanPlayer);

        return game;
    }

    private static void showPlayer(Player humanPlayer) {
        System.out.println("human Player= " + humanPlayer);
    }

    private static int getNumPlayers() {
        //todo: get number of players from user
        return 3;
    }

    private static int getUserChoice() {
        //todo: get value from user for menu
        return 1;
    }

    private static void displayMenu() {
        System.out.println("1. Start the game.");
        System.out.println("2. Exit.");
    }

    private static void displayWelcome() {
        System.out.println("welcome to the game");
    }

}
