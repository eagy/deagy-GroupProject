import java.util.ArrayList;

public class BlackJack {
	private int numDecks, numPlayers, turn;
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
		
		turn = 1; 
		
		deck = new Deck(numDecks);
		discard = new Deck();
		players = new ArrayList<Player>(numPlayers);
		for (int i = 1; i <= numPlayers; i++) {
			players.add(new Player(deck, i));
		}
	}
	
	public Player turn() {
		if (turn < numPlayers) {
			turn++;
			return players.get(turn-2);
		}
		else {
			turn = 1;
			return players.get(turn-1);
		}		
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(int playerNum) {
		players.remove(playerNum-1);
	}
	
	
}
