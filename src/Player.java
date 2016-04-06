import java.util.ArrayList;

/**
 * 
 * @author OTR2
 *
 */
public class Player {
	private final int MAXHAND = 21;
	
	private int handValue, playerNumber;
	Deck gameDeck;
	ArrayList<Card> hand = new ArrayList<>();
	
	/**
	 * 
	 * @param gameDeck the Deck that the player will be using.
	 * @param playerNumber the number assigned to said player.
	 */
	
	public Player(Deck gameDeck, int playerNumber) {
		this.gameDeck = gameDeck;
		this.playerNumber = playerNumber;
	}
	
	/**
	 * 
	 * @param gameDeck the Deck that the player will be using.
	 */
	public Player(Deck gameDeck) {
		this(gameDeck, 1);
	}
	
	/**
	 * draws a card into the players hand. 
	 */
	public void draw(){
		try {
			Card drawCard = gameDeck.removeCard();
			hand.add(drawCard);
			handValue += drawCard.getFaceValue().getFaceValue();
			
			if(hasAce() && handValue > MAXHAND)
				handValue =- 10;
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
	
	public boolean hasBlackjack() {
		return hand.
	}
	public String toString() {
		String playerHand = "Player " + playerNumber + ":\n";
		
		for(Card i : hand){
			playerHand += i.toString() + "\t";
		}
		
		playerHand += "\nHand Total: " + getHandValue();
		return playerHand;
	}
}
