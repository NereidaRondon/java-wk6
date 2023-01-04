import java.util.ArrayList;
import java.util.Collections;

public class Deck {

//	1.	cards (List of Card)
	ArrayList<Card> cards = new ArrayList<Card>();
		
	//	3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	//Constructor
		public Deck (){				
			for (int name = 0; name < 4; name++) {
				for (int value = 2; value <= 14; value++) {
						cards.add(new Card (value, name)); 
				}
			}	
		}

	//	1.	shuffle (randomizes the order of the cards)
	public void shuffle () {
		System.out.println("Shuffling cards...");
		Collections.shuffle(cards);
	}
	
	//	2.	draw (removes and returns the top card of the Cards field)
	public Card draw() {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
}
