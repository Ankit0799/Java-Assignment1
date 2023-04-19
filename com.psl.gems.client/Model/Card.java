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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardSuit == null) ? 0 : cardSuit.hashCode());
        result = prime * result + ((cardRank == null) ? 0 : cardRank.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (cardSuit != other.cardSuit)
            return false;
        if (cardRank != other.cardRank)
            return false;
        return true;
    }

    

    
}


