package jwrf;

public class ValueSuitPair<Value, Suit> {
    final Value value;
    final Suit suit;

    public ValueSuitPair(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    public Value getValue() {
        return this.value;
    }
    public Suit getSuit() {
        return this.suit;
    }
}
