package jwrf;

/**
 * Class which represents a 'trick', i.e a round of play in bridge.
 */
public class Trick {

    private Card[] cardsInTrick = new Card[4];

    private int nextSpotToPlay = 0;

    public boolean addCard(Card card) {
        if (nextSpotToPlay >= 4) {
            return false;
        }
        cardsInTrick[nextSpotToPlay] = card;
        nextSpotToPlay++;
        return true;
    }

    public Card getCard(int position) {
        assert (position >= 0 && position <= 3) : "Invalid position: " + position + ", must be between 0 and 3";
        if (position >= nextSpotToPlay) {
            return null; // Card in this position has not been placed yet
        }
        return cardsInTrick[nextSpotToPlay];
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
