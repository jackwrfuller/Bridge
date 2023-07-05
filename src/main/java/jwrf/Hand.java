package jwrf;

import java.util.List;

public class Hand {

    private static final int TRICKS_PER_HAND = 13;
    private static final int NUM_PLAYERS = 4;


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
        for (int i = 0; i < TRICKS_PER_HAND; i++) {
            tricks[i] = new Trick();
        }
        dealer.newHand();
    }

    public void receiveCard(Card card) {
        Trick currentTrick = tricks[currentTrickIndex];
        currentTrick.addCard(card);
        playerToPlay++;
        checkForNextTrick();
    }
    private void checkForNextTrick() {
        if (playerToPlay >= NUM_PLAYERS && currentTrickIndex < TRICKS_PER_HAND - 1) {
            nextTrick();
        }
    }
    private void nextTrick() {
        currentTrickIndex++;
        playerToPlay = 0;
    }

    @Override
    public String toString() {
       StringBuilder str = new StringBuilder();
       for (int i = 0; i <= currentTrickIndex; i++) {
           if (i != 0 && !tricks[i].toString().equals("")) {
               str.append("\n");
           }
           str.append(tricks[i].toString());
       }
       return str.toString();
    }

}
