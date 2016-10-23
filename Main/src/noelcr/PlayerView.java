package noelcr;


import javax.swing.*;
import java.util.ArrayList;

public class PlayerView extends JPanel{
    Player player;
    JLabel playerName = new JLabel("not set");

    public PlayerView(Player player){
        this.player = player;

        add(playerName);


        addAllCards();
    }

    private void addAllCards() {
        ArrayList<Card> cards = player.getCards();
        //player.getCards();

        for (int i=0; i < cards.size(); i++){
            Card card = cards.get(i);
            CardView cardView = new CardView(card);
            //System.out.println("new card i=" + i);
            add(cardView);


        }
        validate();
        repaint();



    }

}
