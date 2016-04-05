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
}
