/**
 * 
 * @author OTR2
 *
 */


public class Card {
    private Suit suit;
    private FaceValue faceValue;

    public Card(FaceValue faceValue, Suit suit) {
        this.faceValue = faceValue; 
        this.suit = suit;
    }
    
    public String toString() {
        return getFaceValue() + " of " + getSuit();
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    public FaceValue getFaceValue() {
        return faceValue;
    }
    
    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faceValue == null) ? 0 : faceValue.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (faceValue != other.faceValue)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
    
}
