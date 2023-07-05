package jwrf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    private List<Player> players = new ArrayList<>();
    private Dealer dealer;
    private Hand hand;

    void runSetup() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        players = new ArrayList<>();
        Collections.addAll(players, player1, player2, player3, player4);

        dealer = new Dealer(players);
        hand = new Hand(dealer, players);
    }


    @Test
    void receiveCard() {
        runSetup();
        assertEquals("", hand.toString());

        hand.receiveCard(new Card("2C"));
        assertEquals("2C", hand.toString());

        hand.receiveCard(new Card("3C"));
        hand.receiveCard(new Card("4C"));
        hand.receiveCard(new Card("5C"));
        assertEquals("2C-3C-4C-5C", hand.toString());

        hand.receiveCard(new Card("3H"));
        hand.receiveCard(new Card("4H"));
        hand.receiveCard(new Card("5H"));
        hand.receiveCard(new Card("6H"));
        assertEquals("2C-3C-4C-5C\n3H-4H-5H-6H", hand.toString());

        hand.receiveCard(new Card("4D"));
        hand.receiveCard(new Card("5D"));
        hand.receiveCard(new Card("6D"));
        hand.receiveCard(new Card("7D"));
        assertEquals("2C-3C-4C-5C\n3H-4H-5H-6H\n4D-5D-6D-7D", hand.toString());

        hand.receiveCard(new Card("KS"));
        hand.receiveCard(new Card("AS"));
        assertEquals("2C-3C-4C-5C\n3H-4H-5H-6H\n4D-5D-6D-7D\nKS-AS", hand.toString());







    }
}