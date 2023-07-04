package jwrf;

import java.util.List;

public class Hand {

    private static final int TRICKS_PER_HAND = 13;

    private final Dealer dealer;
    private final List<Player> players;
    private Trick[] tricks;
    private int currentTrickIndex = 0;
    private int playerToPlay = 0;
    public Hand(Dealer dealer, List<Player> players) {
        this.dealer = dealer;
        this.players = players;
        setupNewHand();
    }

    private void setupNewHand() {
        tricks = new Trick[TRICKS_PER_HAND];
        dealer.newHand();
    }

    public void playCard(Card card) {
        Trick currentTrick = tricks[currentTrickIndex];
        currentTrick.addCard(card);
        playerToPlay++;
    }



}
