import java.util.*;

/**
 * 
 * @author OTR2
 *
 */
public class Deck { 
    private ArrayList<Card> deck = new ArrayList<Card>();
    private int numDecks;
    
    public Deck() {
    	this(1);
    }
    
    public Deck(int numDecks) {
    	this.numDecks = numDecks;
    	
    	for(int i = 0; i < numDecks; i++) {
	        for (FaceValue card: FaceValue.values()) {
	            for (Suit suit: Suit.values()) {
	                this.deck.add(new Card(card, suit));
	            }
	        }
    	}
    }
    
    public Deck(Deck other) {
    	this(other.numDecks);
    }
    
    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    public Card removeCard() {
    	if(isEmpty())
    		throw new IndexOutOfBoundsException("Deck is empty.");
        return deck.remove(0);
    }
    
    public int remainingCards() {
        return deck.size();
    }
    
    public boolean isEmpty() {
    	return remainingCards() == 0;
    }
    
    public Iterator<Card> Iterator() {
        return deck.iterator();
    }

}
