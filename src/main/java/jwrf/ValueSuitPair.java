package jwrf;

public class Pair<X, Y> {
    final X x;
    final Y y;

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }
    public X getFirst() {
        return this.x;
    }
    public Y getSecond() {
        return this.y;
    }
}
