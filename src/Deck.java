import java.util.*;

/**
 * 
 * @author OTR2
 *
 */
public class Deck { 
    private ArrayList<Card> deck = new ArrayList<Card>(52);
    
    public Deck() {
        for (FaceValue card: FaceValue.values()) {
            for (Suit suit: Suit.values()) {
                this.deck.add(new Card(card, suit));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    public Card removeCard() {
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
