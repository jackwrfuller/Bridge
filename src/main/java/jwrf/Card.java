package jwrf;

public record Card(Suit suit, Value value) {
    @Override
    public String toString() {
        return value.toString() + suit.toString();
    }
}
