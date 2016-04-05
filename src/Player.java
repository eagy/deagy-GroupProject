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
	
	public Player(Deck gameDeck) {
		this.gameDeck = gameDeck;
	}
	
	public void draw(){
		Card drawCard = gameDeck.removeCard();
		hand.add(drawCard);
		
		handValue += drawCard.getFaceValue().getFaceValue();
	}
	
	public int getHandValue() {
		return handValue;
	}
	public String toString() {
		StringBuilder printString = new StringBuilder();
		
		for(Card i : hand){
			printString.append(i.toString() + ", ");
		}
		
		return printString.toString();
	}
}
