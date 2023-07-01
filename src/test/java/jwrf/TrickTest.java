package jwrf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrickTest {

    @Test
    void addCard() {
        Trick trick = new Trick();
        trick.addCard(new Card("2H"));
        assertEquals("2H", trick.toString());
        assertEquals(1, trick.numberPlayed());

        trick.addCard(new Card("3D"));
        assertEquals("2H-3D", trick.toString());
        assertEquals(2, trick.numberPlayed());

        trick.addCard(new Card("4S"));
        assertEquals("2H-3D-4S", trick.toString());
        assertEquals(3, trick.numberPlayed());

        trick.addCard(new Card("10S"));
        assertEquals("2H-3D-4S-10S", trick.toString());
        assertEquals(4, trick.numberPlayed());

        // Check no more cards can be added to trick
        assertFalse(trick.addCard(new Card("AC")));
        assertEquals("2H-3D-4S-10S", trick.toString());
        assertEquals(4, trick.numberPlayed());
    }

    @Test
    void getCard() {
        Trick trick = new Trick();
        assertNull(trick.getCard(0));

        trick.addCard(new Card("4H"));
        assertEquals("4H", trick.getCard(0).toString());
        assertNull(trick.getCard(1));

        trick.addCard(new Card("6C"));
        assertEquals("6C", trick.getCard(1).toString());
        assertNull(trick.getCard(2));

        trick.addCard(new Card("10H"));
        assertEquals("10H", trick.getCard(2).toString());
        assertNull(trick.getCard(3));

        trick.addCard(new Card("KS"));
        assertEquals("KS", trick.getCard(3).toString());
        assertNull(trick.getCard(4));
        assertNull(trick.getCard(5));

    }
}