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

    private boolean isValidDeal(Card card) {
        if (cardsInHand.size() >= 13 || cardsInHand.contains(card)) {
            return false;
        }
        return true;
    }

}
