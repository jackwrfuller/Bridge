package jwrf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Value {
    ACE("A"),
    KING("K"),
    QUEEN("Q"),
    JACK("J"),
    TEN("10"),
    NINE("9"),
    EIGHT("8"),
    SEVEN("7"),
    SIX("6"),
    FIVE("5"),
    FOUR("4"),
    THREE("3"),
    TWO("2");

    private final String stringRep;
    private static final Map<String, Value> ENUM_MAP;

    Value(String c) {
        this.stringRep = c;
    }

    public String getStringName() {
        return stringRep;
    }
    static {
        Map<String, Value> mapBetweenLetterAndSuit = new HashMap<>();
        for (Value instance : Value.values()) {
            mapBetweenLetterAndSuit.put(instance.getStringName(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(mapBetweenLetterAndSuit);
    }
    public static Value get(String stringValue) {
        return ENUM_MAP.get(stringValue);
    }

}
