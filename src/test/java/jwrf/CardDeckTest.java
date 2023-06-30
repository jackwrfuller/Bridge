package jwrf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardDeckTest {

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

    String allCards = "AS AH AD AC KS KH KD KC QS QH QD QC JS JH JD JC 10S 10H 10D 10C 9S 9H 9D 9C 8S 8H 8D 8C 7S 7H 7D 7C 6S 6H 6D 6C 5S 5H 5D 5C 4S 4H 4D 4C 3S 3H 3D 3C 2S 2H 2D 2C";


    @Test
    void testEmptyDeck() {
        CardDeck deck = new CardDeck();
        deck.clearDeck();
        assertEquals(0, deck.size());
        assertEquals("", deck.toString());
    }

    @Test
    void testCardDeal(){
        CardDeck deck = new CardDeck();
        assertEquals(52, deck.size());
        deck.deal();
        assertEquals(51, deck.size());
    }

    @Test
    void testCardRemoval(){
        CardDeck deck = new CardDeck();
        deck.clearDeck();
        deck.addCardsToDeck(cardsInADeck);
        assertEquals(allCards, deck.toString());

        deck.deal();
        assertEquals("AS AH AD AC KS KH KD KC QS QH QD QC JS JH JD JC 10S 10H 10D 10C 9S 9H 9D 9C " +
                "8S 8H 8D 8C 7S 7H 7D 7C 6S 6H 6D 6C 5S 5H 5D 5C 4S 4H 4D 4C 3S 3H 3D 3C 2S 2H 2D", deck.toString());


    }




}
