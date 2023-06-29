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

    private String stringRep;
    private static final Map<String, Value> ENUM_MAP;

    Value(String c) {
        this.stringRep = c;
    }

    public String getName() {
        return stringRep;
    }
    static {
        Map<String, Value> mapBetweenLetterAndSuit = new HashMap<String, Value>();
        for (Value instance : Value.values()) {
            mapBetweenLetterAndSuit.put(instance.getName(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(mapBetweenLetterAndSuit);
    }
    public static Value get(String stringValue) {
        return ENUM_MAP.get(stringValue);
    }

}
