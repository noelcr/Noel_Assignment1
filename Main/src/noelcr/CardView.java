package noelcr;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CardView extends JPanel {
    Card cards;
    JLabel cardName;
    public CardView(Card cards) {
        this.cards = cards;
        cardName = new JLabel(cards.getName() + "_id" + cards.getId());
        add(cardName);

        //cards.getImage();

        addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);

                STGame game = STGame.currentGame;
                boolean playOrNot = STGame.currentGame.validCardToPlay(cards);
                //System.out.println(playOrNot);
                if (!playOrNot) {
                    cardName.setText("CANNOT BE PLAYED");
                }

                game.playCard(cards); //check if card is eligible to play
                System.out.println("you chose card "+cards);
                //place card to play table
                //remove card from player
                cardName.setText("SELECTED");
            }
        });
    }
}
