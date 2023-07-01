package jwrf;

/**
 * Class which represents a 'trick', i.e a round of play in bridge where each of the four players
 * place one card.
 */
public class Trick {

    private Card[] cardsInTrick = new Card[4];

    private int nextSpotToPlay = 0;

    public Trick() {
    }

    public int numberPlayed() {
        return nextSpotToPlay;
    }

    public boolean addCard(Card card) {
        if (nextSpotToPlay >= 4) {
            return false;
        }
        cardsInTrick[nextSpotToPlay] = card;
        nextSpotToPlay++;
        return true;
    }

    public Card getCard(int index) {
        //assert (index >= 0 && index <= 3) : "Invalid position: " + index + ", must be between 0 and 3";
        if (index >= nextSpotToPlay || index < 0 || index > 3) {
            return null; // Card in this position has not been placed yet
        }
        return cardsInTrick[index];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nextSpotToPlay; i++) {
            if (i != 0) {
                str.append("-");
            }
            str.append(cardsInTrick[i].toString());
        }
        return str.toString();
    }
}
