package jwrf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Suit {
    SPADES("S"),
    HEARTS("H"),
    DIAMOND("D"),
    CLUBS("C");

    private final String stringRep;
    private static final Map<String, Suit> ENUM_MAP;

    Suit(String str) {
        this.stringRep = str;
    }
    public String getName() {
        return stringRep;
    }

    static {
        Map<String, Suit> mapBetweenLetterAndSuit = new HashMap<>();
        for (Suit instance : Suit.values()) {
            mapBetweenLetterAndSuit.put(instance.getName(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(mapBetweenLetterAndSuit);
    }
    public static Suit get(String stringSuit) {
        return ENUM_MAP.get(stringSuit);
    }
}
