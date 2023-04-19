package Model;

import Constants.AllCards.Rank;
import Constants.AllCards.Suit;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;
    private int rankWeight;

    public Suit getCardSuit() {
        return cardSuit;
    }

    public Rank getCardRank() {
        return cardRank;
    }

    public int getRankWeight() {
        return rankWeight;
    }

    public void setCardSuit(Suit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public void setCardRank(Rank cardRank) {
        this.cardRank = cardRank;
    }

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
        this.rankWeight = cardRank.getValue()*4 + cardSuit.getValue();
    }

    

    @Override
    public String toString() {
        return "Card [cardSuit=" + cardSuit + ", cardRank=" + cardRank + ", rankWeight=" + rankWeight + "]\n";
    }

    
}


