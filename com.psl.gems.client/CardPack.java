import Constants.AllCards.Rank;
import Constants.AllCards.Suit;
import Model.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

//This class is a SingleTon to create and manage a deck i.e., set of 52 cards.
final class CardPack {

    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> resetDeck = new ArrayList<Card>();

    public static CardPack shared = new CardPack(); //Creating instance of CardPack.

    private CardPack() {

        // Populating deck with cards
        EnumSet.allOf(Suit.class).forEach(suit -> {
            EnumSet.allOf(Rank.class).forEach(rank -> {
                deck.add(new Card(suit, rank));
            });
        });

        resetDeck.addAll(deck); //Making a copy of deck so that it can be reseted.
    }

    //Used to print the current deck state.
    public void showDeck() {    
        System.out.println(deck);
    }

    //Used to suffle the deck.
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    //Getting the top most card.
    public Card getTopCard() {
        return deck.get(0);
    }

    //Getting random card from the deck.
    public Card getRandomCard() {
        int rando = (int) ((Math.random() * deck.size()));
        Card removedCard = deck.get(rando);
        deck.remove(rando);
        return removedCard;
    }

    //Adding a Card to the deck.
    public void addCard(Card c) {
        if (deck.size() <= 52 && !deck.contains(c)) {
            System.out.println("Card Added");       //Checking first if the deck is complete, if not then check the card that is to be added 
                                                      // already exist or not
        } else {
            System.out.println("Duplicates are not Allowed");
        }
    }

    //Returning the deck size.
    public int deckSize() {
        return deck.size();
    }

    //Resetting the deck.
    public void resetDeck() {
        deck.clear();
        deck.addAll(resetDeck);
    }

}
