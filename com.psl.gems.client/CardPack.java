import Constants.AllCards.Rank;
import Constants.AllCards.Suit;
import Model.Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Random;

final class CardPack {


    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> resetDeck = new ArrayList<Card>();


    
    public static CardPack shared = new CardPack();

    private CardPack() {

        //Populating deck with cards
        EnumSet.allOf(Suit.class).forEach(suit -> {
            EnumSet.allOf(Rank.class).forEach(rank -> {
                deck.add(new Card(suit, rank));
            });
        });

        resetDeck.addAll(deck);
    }

    public void showDeck() {
        System.out.println(deck);
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public Card getTopCard(){
        return deck.get(0);
    }

    public Card getRandomCard(){
        int rando = (int) ((Math.random() * deck.size()));
        Card removedCard = deck.get(rando);
        deck.remove(rando);
        return removedCard;
    }

    public void addCard(Card c){
        if(deck.size() <= 52 && !deck.contains(c)){
            System.out.println("Card Added");
        } else {
            System.out.println("Duplicates are not Allowed");
        }
    }

    public int deckSize(){
        return deck.size();
    }

    public void resetDeck(){
        deck.clear();
        deck.addAll(resetDeck);
    }
    
}
