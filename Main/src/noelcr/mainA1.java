package noelcr;

/**
 * Created by Noel on 26/09/2016.
 */
public class mainA1 {
    public static void main(String[] args) {
        System.out.println("Hello player");
        displayWelcome();
        displayMenu();

        
    }

    private static void displayMenu() {
        System.out.println("1. Start the game.");
        System.out.println("2. Exit.");
    }

    private static void displayWelcome() {
        System.out.println("welcome to the game");
    }

}
