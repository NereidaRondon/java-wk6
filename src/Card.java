public class Card {

//	1.	value (contains a value from 2-14 representing cards 2-Ace)
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	
	private int value;
	private int name;
	
	public Card(int value, int name) {
		this.value = value;
		this.name = name;
	}
	
//	hearts = 0;
//	diamonds = 1;
//	clubs = 2;
//	spades = 3;
	
//	1.	Getters and Setters... gets numerical value of card from 2-14
	public int getValue() {
		return value;
	}
//	2.	describe (prints out information about a card)
	public void describe() {
		
		//Use the value to determine if card is a face card or Ace
		String cardValue;
		if(value == 11) {
			cardValue = "Jack";
		}else if(value == 12) {
			cardValue = "Queen";
		}else if(value == 13) {
			cardValue = "King";
		}else if (value == 14) {
			cardValue = "Ace";
		}else {
			cardValue = String.valueOf(value);
		}
		
		//Sets the suit of the card
		String suitName;
		if(name == 0) {
			suitName = "hearts ♥️";
		}else if (name == 1) {
			suitName = "diamonds ♦️";
		}else if (name == 2) {
			suitName = "clubs ♣️";
		}else {
			suitName ="spades ♠️";
		}
		
		//describe prints out the number or letter and suit of each card
		System.out.println(cardValue + " of "+ suitName);
	}
}