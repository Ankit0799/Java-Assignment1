import Constants.CardRank;
import Constants.CardSuite;
import Model.Card;

final class CardPack {
    private Card[] cardPack = {
        new Card(CardSuite.SPADE, CardRank.TWO),
        new Card(CardSuite.SPADE, CardRank.THREE),new Card(CardSuite.SPADE, CardRank.FOUR),
        new Card(CardSuite.SPADE, CardRank.FIVE),new Card(CardSuite.SPADE, CardRank.SIX),
        new Card(CardSuite.SPADE, CardRank.SEVEN),new Card(CardSuite.SPADE, CardRank.EIGHT),
        new Card(CardSuite.SPADE, CardRank.NINE),new Card(CardSuite.SPADE, CardRank.TEN),
        new Card(CardSuite.SPADE, CardRank.JACK),new Card(CardSuite.SPADE, CardRank.QUEEN),
        new Card(CardSuite.SPADE, CardRank.KING),new Card(CardSuite.SPADE, CardRank.ACE),

        new Card(CardSuite.DIAMOND, CardRank.TWO),
        new Card(CardSuite.DIAMOND, CardRank.THREE),new Card(CardSuite.DIAMOND, CardRank.FOUR),
        new Card(CardSuite.DIAMOND, CardRank.FIVE),new Card(CardSuite.DIAMOND, CardRank.SIX),
        new Card(CardSuite.DIAMOND, CardRank.SEVEN),new Card(CardSuite.DIAMOND, CardRank.EIGHT),
        new Card(CardSuite.DIAMOND, CardRank.NINE),new Card(CardSuite.DIAMOND, CardRank.TEN),
        new Card(CardSuite.DIAMOND, CardRank.JACK),new Card(CardSuite.DIAMOND, CardRank.QUEEN),
        new Card(CardSuite.DIAMOND, CardRank.KING),new Card(CardSuite.DIAMOND, CardRank.ACE),

        new Card(CardSuite.HEART, CardRank.TWO),
        new Card(CardSuite.HEART, CardRank.THREE),new Card(CardSuite.HEART, CardRank.FOUR),
        new Card(CardSuite.HEART, CardRank.FIVE),new Card(CardSuite.HEART, CardRank.SIX),
        new Card(CardSuite.HEART, CardRank.SEVEN),new Card(CardSuite.HEART, CardRank.EIGHT),
        new Card(CardSuite.HEART, CardRank.NINE),new Card(CardSuite.HEART, CardRank.TEN),
        new Card(CardSuite.HEART, CardRank.JACK),new Card(CardSuite.HEART, CardRank.QUEEN),
        new Card(CardSuite.HEART, CardRank.KING),new Card(CardSuite.HEART, CardRank.ACE),

        new Card(CardSuite.CLUB, CardRank.TWO),
        new Card(CardSuite.CLUB, CardRank.THREE),new Card(CardSuite.CLUB, CardRank.FOUR),
        new Card(CardSuite.CLUB, CardRank.FIVE),new Card(CardSuite.CLUB, CardRank.SIX),
        new Card(CardSuite.CLUB, CardRank.SEVEN),new Card(CardSuite.CLUB, CardRank.EIGHT),
        new Card(CardSuite.CLUB, CardRank.NINE),new Card(CardSuite.CLUB, CardRank.TEN),
        new Card(CardSuite.CLUB, CardRank.JACK),new Card(CardSuite.CLUB, CardRank.QUEEN),
        new Card(CardSuite.CLUB, CardRank.KING),new Card(CardSuite.CLUB, CardRank.ACE)
    
    
    };

    public static CardPack shared = new CardPack();

    private CardPack() {
    }
    
}
