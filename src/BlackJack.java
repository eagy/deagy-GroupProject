
public class BlackJack {
	private int numDecks;
	private int numPlayers;
	
	
	public BlackJack() {
		numDecks = 1;
		numPlayers = 1;
	}
	
	public BlackJack(int numDecks, int numPlayers) {
		this.numDecks = numDecks;
		this.numPlayers = numPlayers;
	}
	
	public BlackJack(int numPlayers) {
		this(1, numPlayers);
	}
	
	
}
