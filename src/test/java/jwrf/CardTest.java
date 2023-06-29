package jwrf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    String[] cardsInADeck = new String[] {
            "AS", "AH", "AD", "AC",
            "KS", "KH", "KD", "KC",
            "QS", "QH", "QD", "QC",
            "JS", "JH", "JD", "JC",
            "10S", "10H", "10D", "10C",
            "9S", "9H", "9D", "9C",
            "8S", "8H", "8D", "8C",
            "7S", "7H", "7D", "7C",
            "6S", "6H", "6D", "6C",
            "5S", "5H", "5D", "5C",
            "4S", "4H", "4D", "4C",
            "3S", "3H", "3D", "3C",
            "2S", "2H", "2D", "2C",
    };




    @Test
    void testToString() {
        for (String cardString : cardsInADeck) {
            Card card = new Card(cardString);
            assertEquals(cardString, card.toString());
        }
    }

    @Test
    void testCardSuitAndValue() {
        Card card = new Card("10D");
        assertEquals(Suit.DIAMOND, card.suit());
        assertEquals(Value.TEN, card.value());
        card = new Card("10H");
        assertEquals(Suit.HEARTS, card.suit());
        assertEquals(Value.TEN, card.value());
        card = new Card("10S");
        assertEquals(Suit.SPADES, card.suit());
        assertEquals(Value.TEN, card.value());
        card = new Card("10C");
        assertEquals(Suit.CLUBS, card.suit());
        assertEquals(Value.TEN, card.value());

        card = new Card("5S");
        assertEquals(Suit.SPADES, card.suit());
        assertEquals(Value.FIVE, card.value());
        card = new Card("5H");
        assertEquals(Suit.HEARTS, card.suit());
        assertEquals(Value.FIVE, card.value());
        card = new Card("5D");
        assertEquals(Suit.DIAMOND, card.suit());
        assertEquals(Value.FIVE, card.value());
        card = new Card("5C");
        assertEquals(Suit.CLUBS, card.suit());
        assertEquals(Value.FIVE, card.value());

    }
}