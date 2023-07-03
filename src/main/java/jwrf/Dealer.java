package jwrf;

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

    public void newHand() {
        clearHands();
        deck = new CardDeck();
        distributeDeck();
    }

    public void clearHands() {
        for (Player p : players) {
            p.clearHand();
        }
    }

    private void distributeDeck() {
        // Will look to change to implementing with circular array for players and
        // iterator version of CardDeck
        int currentPlayerToDeal = 0;
        int deckSize = deck.size();
        for (int i = 0; i < deckSize; i++) {
            Player currentPlayer = players.get(currentPlayerToDeal);
            currentPlayer.receiveCard(deck.deal());
            currentPlayerToDeal = (currentPlayerToDeal + 1) % players.size();
        }

    }



}
