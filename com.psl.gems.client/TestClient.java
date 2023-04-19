
public class TestClient{
    public static void main(String[] args) {

        CardPack cp = CardPack.shared;
        cp.showDeck();
        cp.shuffileDeck();
        cp.showDeck();

    }
}