package jwrf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CardDeck {

    private Stack<Card> cardDeck = new Stack<>();

    private static final String[] cardStringsInADeck = new String[] {
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

    public CardDeck(){
        addDefaultDeck();
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cardDeck);
    }

    public Card deal(){
        return cardDeck.pop();
    }

    public void addCardsToDeck(Set<Card> cards) {
        for (Card card : cards) {
            cardDeck.push(card);
        }
    }

    public void addCardsToDeck(String[] cardStrings) {
        addCardsToDeck(getCardsInADeckFromString(cardStrings));
    }

    private static Set<Card> getCardsInADeckFromString(String[] cardStrings) {
        Set<Card> deck = new HashSet<>();
        for (String cardString : cardStrings) {
            deck.add(new Card(cardString));
        }
        return deck;
    }

    private void addDefaultDeck() {
        clearDeck();
        addCardsToDeck(getCardsInADeckFromString(cardStringsInADeck));
    }

    public void clearDeck() {
        cardDeck.clear();
    }


    @Override
    public String toString() {
        StringBuilder deckString = new StringBuilder();
        for (Card card : cardDeck) {
            deckString.append(card.toString());
            deckString.append(" ");
        }
        return deckString.toString();
    }

}
