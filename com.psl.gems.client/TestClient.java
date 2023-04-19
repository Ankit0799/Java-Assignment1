import java.util.HashMap;

import Constants.AllCards.Rank;
import Constants.AllCards.Suit;
import Model.Card;
import Model.Player;
import Utilities.FileOperation;
import Utilities.Html;

public class TestClient {

    // static HashMap<Player, Card> playerCards;
    static int[] playerOneCardWeight;
    static int[] playerTwoCardWeight;
    static Player[] currentPlayer;
    static Card[][] playerCards;

    public static void main(String[] args) {
        Player one = new Player("Ankit", 0);
        Player two = new Player("Abhishek", 1);
        // playerCards = new HashMap<Player, Card>();
        playerOneCardWeight = new int[3];
        playerTwoCardWeight = new int[3];
        currentPlayer = new Player[2];
        playerCards = new Card[2][3];
        createGame(one, two);
        // System.out.println(Html.data);

    }

    private static void createGame(Player one, Player two) {
        CardPack cp = CardPack.shared;
        cp.shuffleDeck();
        registerPlayers(one, two);
        play(cp);
        writeToFile();
    }

    private static void writeToFile() {
        String output = String.format(Html.data, currentPlayer[0].getName(), 
                                        getCard(playerCards[0][0]),getCard(playerCards[0][1]),getCard(playerCards[0][2]),
                                        currentPlayer[1].getName(),
                                        getCard(playerCards[1][0]),getCard(playerCards[1][1]),getCard(playerCards[1][2]));
        // System.out.println(output);
        FileOperation.write(output);
    }
    private static String getCard(Card p){
        return p.getCardSuit()+"-"+p.getCardRank();
    }

    private static void play(CardPack cp) {
        int playerOneHighestCard = -1, playerTwoHighestCard = -1;
        for (int i = 0; i < 3; i++) {
            playerCards[0][i] = cp.getRandomCard();
            playerCards[1][i] = cp.getRandomCard();

            if (playerOneHighestCard < playerCards[0][i].getRankWeight()) {
                playerOneHighestCard = playerCards[0][i].getRankWeight();
            }
            if (playerTwoHighestCard < playerCards[1][i].getRankWeight()) {
                playerTwoHighestCard = playerCards[1][i].getRankWeight();
            }
        }
        int winner = playerOneHighestCard > playerTwoHighestCard ? 0 : 1;
        System.out.println("Winner is: " + currentPlayer[winner].getName());

    }

    private static void registerPlayers(Player one, Player two) {
        currentPlayer[0] = one;
        currentPlayer[1] = two;
    }

}