import Constants.AllCards.Rank;
import Constants.AllCards.Suit;
import Model.Card;

import java.util.ArrayList;
import java.util.EnumSet;

final class CardPack {


    private ArrayList<Card> deck = new ArrayList<Card>();

    
    public static CardPack shared = new CardPack();

    private CardPack() {

        //Populating deck with cards
        EnumSet.allOf(Suit.class).forEach(suit -> {
            EnumSet.allOf(Rank.class).forEach(rank -> {
                deck.add(new Card(suit, rank));
            });
        });
    }

    public void showDeck() {
        System.out.println(deck);
    }

    // public Card[] shuffile

    
    
}
