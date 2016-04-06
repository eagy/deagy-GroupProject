import java.util.ArrayList;

public class BlackJack {
	private int numDecks;
	private int numPlayers;
	private ArrayList<Player> players;
	private Dealer dealer; 
	private Deck deck;
	private Deck discard;
	
	public BlackJack() {
		this(1, 1);
	}
	
	public BlackJack(int numPlayers) {
		this(1, numPlayers);
	}
	
	public BlackJack(int numDecks, int numPlayers) {
		this.numDecks = numDecks; 
		this.numPlayers = numPlayers;
		
		deck = new Deck(numDecks);
		discard = new Deck();
		players = new ArrayList<Player>(numPlayers);
		for (int i = 1; i <= numPlayers; i++) {
			players.add(new Player(deck, i));
		}
	}
	

	
	
	
}
