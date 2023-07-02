package jwrf;

import java.util.ArrayList;
import java.util.List;

/**
 * Deals out a deck of cards to players
 */
public class Dealer {

    private CardDeck deck;

    private final List<Player> players;

    public Dealer(List<Player> players) {
        this.players = players;
    }

    private void clearHands() {
        for (Player p : players) {
            p.clearHand();
        }
    }




}
