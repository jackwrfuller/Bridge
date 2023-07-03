package jwrf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class DealerTest {

    @Test
    void testClearingHands() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        Dealer dealer = new Dealer(players);
        dealer.newHand();
        dealer.clearHands();

        assertEquals(0, player1.numberCardsInHand());
        assertEquals(0, player2.numberCardsInHand());
        assertEquals(0, player3.numberCardsInHand());
        assertEquals(0, player3.numberCardsInHand());



    }

    /**
     * Test assumes the card deck has exactly 52 cards
     */
    @Test
    void newHand() {

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        Dealer dealer = new Dealer(players);
        dealer.newHand();

        System.out.println("Player 1: " + player1.numberCardsInHand() + " cards\n"
            + "Player 2: " + player2.numberCardsInHand() + " cards\n"
            + "Player 3: " + player3.numberCardsInHand() + " cards\n"
            + "Player 4: " + player4.numberCardsInHand() + " cards");
        assertEquals(13, player1.numberCardsInHand(), "Wrong number of cards: " + player1.numberCardsInHand());
        assertEquals(13, player2.numberCardsInHand());
        assertEquals(13, player3.numberCardsInHand());
        assertEquals(13, player3.numberCardsInHand());
    }
}