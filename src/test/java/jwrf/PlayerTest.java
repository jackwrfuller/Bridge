package jwrf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void receiveCard() {
        Player player = new Player();
        assertEquals(0, player.numberCardsInHand());

        CardDeck deck = new CardDeck();
        for (int i = 0; i < 13; i++) {
            player.receiveCard(deck.deal());
            assertEquals(i+1, player.numberCardsInHand());
        }
        assertFalse(player.receiveCard(deck.deal()));
        assertEquals(13, player.numberCardsInHand());

        player.clearHand();
        player.receiveCard(new Card("AS"));
        assertFalse(player.receiveCard(new Card("AS")));
    }
}