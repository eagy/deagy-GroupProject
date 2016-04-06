import java.util.ArrayList;

/**
 * 
 * @author OTR2
 *
 */
public class Player {
	private int handValue;
	Deck gameDeck;
	ArrayList<Card> hand = new ArrayList<>();
	
	/**
	 * 
	 * @param gameDeck the Deck that the player will be using.
	 */
	
	public Player(Deck gameDeck) {
		this.gameDeck = gameDeck;
	}
	
	/**
	 * draws a card into the players hand. 
	 */
	public void draw(){
		try {
			Card drawCard = gameDeck.removeCard();
			hand.add(drawCard);
			handValue += drawCard.getFaceValue().getFaceValue();
		}
		catch (Throwable e){
			System.out.println("Deck is empty.");
		}
	}
	
	public int getHandValue() {
		return handValue;
	}
	
	public boolean hasAce() {
		return hand.contains(new Card(FaceValue.ACE, Suit.SPADES))
				|| hand.contains(new Card(FaceValue.ACE, Suit.HEARTS))
				|| hand.contains(new Card(FaceValue.ACE, Suit.DIAMONDS))
				|| hand.contains(new Card(FaceValue.ACE, Suit.CLUBS));
	}
	public String toString() {
		StringBuilder printString = new StringBuilder();
		
		for(Card i : hand){
			printString.append(i.toString() + ", ");
		}
		
		return printString.toString();
	}
}
