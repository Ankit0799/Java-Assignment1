package Constants;
//This class will help us to define Suit and Rank of a Card with provided weight.
public class AllCards {

   public enum Suit {
        SPADE(3), DIAMOND(1), HEART(2), CLUB(0);

        private int value;

        private Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
    
   public enum Rank {
        TWO(0), THREE(1), FOUR(2), FIVE(3), SIX(4), SEVEN(5), EIGHT(6), NINE(7), TEN(8), JACK(9), QUEEN(10), KING(11), ACE(12);

        private int value;

        private Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
