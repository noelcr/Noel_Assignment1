package noelcr;

import java.util.ArrayList;

/**
 * Created by Noel on 26/09/2016.
 */
public class Player {
    private ArrayList<Card> cards;
    private String playerID;

    public Player(String playerID){
        this.playerID = playerID;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String toString(){
        return "PlayerID" + playerID;
    }
}
