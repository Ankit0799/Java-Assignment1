import Model.Card;
import Model.Player;
import Utilities.FileOperation;
import Utilities.Html;

public class TestClient {

    // static HashMap<Player, Card> playerCards;
    static int[] playerOneCardWeight;           //Card weight for each card of player one.
    static int[] playerTwoCardWeight;           //Card weight for each card of player two.
    static Player[] currentPlayer;              //Currently registered players.
    static Card[][] playerCards;                //Card for both players.

    public static void main(String[] args) {
        Player one = new Player("Ankit", 0);
        Player two = new Player("Abhishek", 1);     //Creating players.
        // playerCards = new HashMap<Player, Card>();
        playerOneCardWeight = new int[3];
        playerTwoCardWeight = new int[3];
        currentPlayer = new Player[2];
        playerCards = new Card[2][3];
        createGame(one, two);
        // System.out.println(Html.data);

    }

    //Creating Game.
    private static void createGame(Player one, Player two) {
        CardPack cp = CardPack.shared;                      //Getting the instance of CardPack.
        cp.shuffleDeck();                                   
        registerPlayers(one, two);
        play(cp);
        writeToFile();
    }

    //Writing Html to the file.
    private static void writeToFile() {
        String output = String.format(Html.data, currentPlayer[0].getName(),         //Processing Html template with game outputs.
                getCard(playerCards[0][0]), getCard(playerCards[0][1]), getCard(playerCards[0][2]),
                currentPlayer[1].getName(),
                getCard(playerCards[1][0]), getCard(playerCards[1][1]), getCard(playerCards[1][2]));
        // System.out.println(output);
        FileOperation.write(output);
    }

    //Getting the Card details in required format.
    private static String getCard(Card p) {
        return p.getCardSuit() + "-" + p.getCardRank();
    }

    //Game implementation.
    private static void play(CardPack cp) {
        int playerOneHighestCard = -1, playerTwoHighestCard = -1;
        for (int i = 0; i < 3; i++) {       
            playerCards[0][i] = cp.getRandomCard();
            playerCards[1][i] = cp.getRandomCard();             //Distribuiting cards to both players one-by-one.

            if (playerOneHighestCard < playerCards[0][i].getRankWeight()) {
                playerOneHighestCard = playerCards[0][i].getRankWeight();
            }
            if (playerTwoHighestCard < playerCards[1][i].getRankWeight()) {
                playerTwoHighestCard = playerCards[1][i].getRankWeight();
            }                                                           //Getting the highest rank weight for both players.
        }
        int winner = playerOneHighestCard > playerTwoHighestCard ? 0 : 1;   //Checking the winner.
        System.out.println("Winner is: " + currentPlayer[winner].getName());

    }

    //Registering players to the Game.
    private static void registerPlayers(Player one, Player two) {
        currentPlayer[0] = one;
        currentPlayer[1] = two;
    }

}