package Model;

import javax.swing.text.Utilities;

import Constants.CardRank;
import Constants.CardSuite;

// // enum CardType{
// //     SPADE(3),
// //     HEART(2),
// //     DIAMOND(1),
// //     CLUB(0);

//     private int value;

//     private CardType(int value) {
//         this.value = value;
//     }

//     public int getValue() {
//         return value;
//     }

// }

// enum CardRank{
//     ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
// }

public class Card {
    private String cardSuit;
    private String cardRank;
    private int rankWeight;

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardRank() {
        return cardRank;
    }

    public int getRankWeight() {
        return rankWeight;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public void setCardRank(String cardRank) {
        this.cardRank = cardRank;
    }

    public Card(String cardSuit, String cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
        this.rankWeight = calculateRankWeight()* 4 + calculateSuitWeight();
    }

    private int calculateSuitWeight() {
        int typeWeight = -1;
        switch (cardSuit) {
            case CardSuite.SPADE:
                typeWeight = CardSuite.SPADE_WEIGHT;
                break;

            case CardSuite.CLUB:
                typeWeight = CardSuite.CLUB_WEIGHT;
                break;
            case CardSuite.DIAMOND:
                typeWeight = CardSuite.DIAMOND_WEIGHT;
                break;
            case CardSuite.HEART:
                typeWeight = CardSuite.HEART_WEIGHT;
                break;
        }
            return typeWeight;
    }

    private int calculateRankWeight() {
        int typeWeight = -1;
        switch (cardRank) {
            case CardRank.TWO:
                typeWeight = CardRank.TWO_WEIGHT;
                break;
            case CardRank.THREE:
                typeWeight = CardRank.THREE_WEIGHT;
                break;
            case CardRank.FOUR:
                typeWeight = CardRank.FOUR_WEIGHT;
                break;
            case CardRank.FIVE:
                typeWeight = CardRank.FIVE_WEIGHT;
                break;
                case CardRank.SIX:
                typeWeight = CardRank.SIX_WEIGHT;
                break;
            case CardRank.SEVEN:
                typeWeight = CardRank.SEVEN_WEIGHT;
                break;
            case CardRank.EIGHT:
                typeWeight = CardRank.EIGHT_WEIGHT;
                break;
            case CardRank.NINE:
                typeWeight = CardRank.NINE_WEIGHT;
                break;
            case CardRank.TEN:
                typeWeight = CardRank.TEN_WEIGHT;
                break;
            case CardRank.JACK:
                typeWeight = CardRank.JACK_WEIGHT;
                break;
            case CardRank.QUEEN:
                typeWeight = CardRank.QUEEN_WEIGHT;
                break;
            case CardRank.KING:
                typeWeight = CardRank.KING_WEIGHT;
                break;
            case CardRank.ACE:
                typeWeight = CardRank.ACE_WEIGHT;
                break;
        }
            return typeWeight;
    }

}
