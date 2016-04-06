import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		Deck cardDeck = new Deck(3);
		
		cardDeck.shuffle();
		cardDeck.shuffle();
		
		Iterator<Card> it = cardDeck.Iterator();
		while (it.hasNext()) {
			System.out.println(cardDeck.removeCard());
			System.out.println(cardDeck.remainingCards());
			
		}
	}

}
