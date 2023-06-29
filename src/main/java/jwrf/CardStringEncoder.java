package jwrf;

public class CardStringEncoder {

    /**
     * Returns a Value from a correct card string. E.g Given "AS" it returns Value.ACE
     *
     */
    public static Value getValueFromString(String cardString) {
        assert (isValidCardString(cardString)) : "Invalid card string: " + cardString;
        // Case where value is "10", the only card string with three characters
        if (cardString.length() == 3) {
            return Value.get("10");
        }
        String[] strArr = cardString.split("");
        return Value.get(strArr[0]);
    }

    public static Suit getSuitFromString(String cardString) {
        assert (isValidCardString(cardString)) : "Invalid card string: " + cardString;
        String suitString = cardString.length() == 3 ? String.valueOf(cardString.charAt(2)) : String.valueOf(cardString.charAt(1));
        return Suit.get(suitString);
    }

    private static boolean isValidCardString(String cardString) {
        if (cardString.length() > 3 || cardString.length() < 2) {
            return false;
        }
        if (cardString.length() == 3) {
            String[] strArr = cardString.split("");
            if (!strArr[0].equals("1") || !strArr[1].equals("0") || !strArr[2].matches("[SDHC]") ) {
                return false;
            }
        }
        if (cardString.length() == 2 && !cardString.matches("[AKQJ98765432][SDHC]")) {
            return false;
        }
        return true;
    }

}
