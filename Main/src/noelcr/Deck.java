package noelcr;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<Card> cards;
    ///////////////////////


    //todo: import list of all cards



    public Deck(){
        cards =  new ArrayList<Card>();

        for (int i = 0; i < NUM_CARDS_INIT; i++) {
             cards.add(new Card(i));
            //howe to get list and random shuffle
            //google how to create random array of integers - don't repeat integers
        }

    }
    public ArrayList<Card> dealCards(int numCardsDealt) {
        ArrayList<Card> ret = new ArrayList<Card>();

        for (int i = 0; i < numCardsDealt; i++) {
            int idx = new Random().nextInt(cards.size());
            Card card = cards.remove(idx);
            ret.add(card);
            System.out.println("\n Card = " + card);

        }
        return ret;
    }
}
