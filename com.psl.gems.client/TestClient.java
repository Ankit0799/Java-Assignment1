import Constants.CardRank;
import Constants.CardSuite;
import Model.Card;

public class TestClient{
    public static void main(String[] args) {
        System.out.println("hello!");

        Card card = new Card(CardSuite.CLUB, CardRank.JACK);
        System.out.println(card.getRankWeight());
        
    }


}