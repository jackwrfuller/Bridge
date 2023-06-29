package jwrf;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Value value, Suit suit) {
        this.suit = suit;
        this.value = value;
    }

    public Card(String cardString) {
        ValueSuitPair<Value, Suit> valueSuitPair = getValueSuitPairFromString(cardString);
        this.value = valueSuitPair.getValue();
        this.suit = valueSuitPair.getSuit();
    }

    private static ValueSuitPair<Value, Suit> getValueSuitPairFromString(String cardString) {
        String[] strArr = cardString.split("");
        Value value = Value.get(strArr[0]);
        Suit suit = Suit.get(strArr[1]);
        return new ValueSuitPair<>(value, suit);
    }

    @Override
    public String toString() {
        return value.getName() + suit.getName();
    }
}
