package jwrf;

public class Main {
    public static void main(String[] args) {

        CardDeck deck = new CardDeck();

        System.out.println("test");

        for (Card card : deck) {
            System.out.println(card);
        }

    }
}