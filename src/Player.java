import java.util.ArrayList;
import java.util.List;

public class Player {

	//	1.	hand (List of Card)
	List<Card> hand = new ArrayList<Card>();

	//	2.	score (set to 0 in the constructor)
	private int score;

	//	3.	name
	private String name;
	
	//Constructor for Players
	public Player (String name, int score) {
		this.name = name;
		this.score= 0;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	//setName is not used
	public void setName(String name) {
		this.name = name;
	}
	
	//	1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
	public void describe() {
		System.out.println("--------------------------------\n");
		System.out.println(name + " has " + score + " points.\n");
		System.out.println("This is " + name + "'s hand:\n");
		for(Card card: hand) {
			card.describe();
		}
	}
	
	//	2.	flip (removes and returns the top card of the Hand)
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	//	3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void draw(Deck gameDeck) {
		Card card = gameDeck.draw();
		hand.add(card);
	}
	
	//	4.	incrementScore (adds 1 to the Player’s score field)
	//gets the score and adds one point to it, then sets the new score
	public void incrementScore() {
		setScore(getScore()+ 1);
	}
}
