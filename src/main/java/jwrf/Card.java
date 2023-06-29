package jwrf;

public record Card(Value value, Suit suit) {

    public Card(String cardString) {
        this(CardStringEncoder.getValueFromString(cardString), CardStringEncoder.getSuitFromString(cardString));
    }

    @Override
    public String toString() {
        return value.toString() + suit.toString();
    }
}
