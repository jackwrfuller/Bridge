package jwrf;


import java.util.HashSet;
import java.util.Set;

public class Player {

    private Set<Card> cardsInHand = new HashSet<>();

    public Player(){}

    public boolean receiveCard(Card card) {
        if (!isValidDeal(card)) {
            return false;
        }
        cardsInHand.add(card);
        return true;
    }

    public int numberCardsInHand() {
        return cardsInHand.size();
    }

    public void clearHand() {
        cardsInHand.clear();
    }

    private boolean isValidDeal(Card card) {
        return cardsInHand.size() < 13 && !cardsInHand.contains(card);
    }

}
