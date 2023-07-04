package jwrf;

import java.util.*;

public class CardDeck implements Iterable<Card>{

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
    private void addDefaultDeck() {
        clearDeck();
        addCardsToDeck(getCardsInADeckFromString(cardStringsInADeck));
    }
    public void shuffle(){
        Collections.shuffle(cardDeck);
    }
    public void clearDeck() {
        cardDeck.clear();
    }
    public void addCardsToDeck(LinkedHashSet<Card> cards) {
        for (Card card : cards) {
            cardDeck.push(card);
        }
    }
    private static LinkedHashSet<Card> getCardsInADeckFromString(String[] cardStrings) {
        LinkedHashSet<Card> deck = new LinkedHashSet<>();
        for (String cardString : cardStrings) {
            deck.add(new Card(cardString));
        }
        return deck;
    }

    public int size() {
        return cardDeck.size();
    }

    public Card deal(){
        return cardDeck.pop();
    }

    public void addCardsToDeck(String[] cardStrings) {
        addCardsToDeck(getCardsInADeckFromString(cardStrings));
    }

    @Override
    public String toString() {
        if (cardDeck.size() == 0) {
            return "";
        }
        StringBuilder deckString = new StringBuilder();
        for (Card card : cardDeck) {
            deckString.append(card.toString());
            deckString.append(" ");
        }
        deckString.deleteCharAt(deckString.length() - 1);
        return deckString.toString();
    }

    @Override
    public Iterator<Card> iterator() {
        return new CardDeckIterator();
    }

    class CardDeckIterator implements Iterator<Card> {
        private int index = 0;

        public boolean hasNext() {
            return index < size();
        }
        public Card next() {
            return cardDeck.get(index++);
        }
    }


}
