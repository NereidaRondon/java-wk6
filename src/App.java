public class App {

	public static void main(String[] args) {
		System.out.println("Ready for War!\n");
		
		//	a)	Instantiate a Deck and two Players, call the shuffle method on the deck.

		//Create players, start score at 0
		Player player1 = new Player("Player 1", 0);
		Player player2 = new Player("Player 2", 0);
		
		System.out.println(player1.getName() + " score: " + player1.getScore() + "\n");
		System.out.println(player2.getName() + " score: " + player2.getScore() + "\n");
		System.out.println("--------------------------------\n");
		//make a new deck
		Deck newDeckOfCards = new Deck();
		
		//shuffle the deck
		newDeckOfCards.shuffle();	
		System.out.println("\n--------------------------------\n");
		//	b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		//draws a card and adds it to a players hand 
		System.out.println("Dealing Cards...\n");
		for(int i = 0; i < 52; i++){ 		
			if(i%2==0) {
				player1.hand.add(newDeckOfCards.draw());				
			}else {
				player2.hand.add(newDeckOfCards.draw()); 				
			}
		}
		//prints out the players information, current score and cards in hand 
		player1.describe();
		player2.describe();
		
		System.out.println("--------------------------------\n");	
		System.out.println("Players draw and flip cards...\n");
		System.out.println("--------------------------------\n");
		
//	c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.

		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			System.out.println("Round "+ (i + 1)+":\n");
			
			System.out.println("Player 1's card:"); 
			player1Card.describe();
			System.out.println("\n");
			
			System.out.println("Player 2's card:");
			player2Card.describe();
			System.out.println("\n");
			
			//	d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
			if (player1Card.getValue() > player2Card.getValue()) {	
				player1.incrementScore();
				System.out.println("Point to " + player1.getName() + " !");	
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println("Point to " + player2.getName() + " !");
			} else {
				System.out.println("Draw! No points awarded.");
			}
			
			System.out.println("\n*******SCORE*******");
			System.out.println(player1.getName() + " score: " + player1.getScore());
			System.out.println(player2.getName() + " score: " + player2.getScore() + "\n");
			System.out.println("--------------------------------\n");
		}  
		
//	e)	After the loop, compare the final score from each player. 
//	f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		
		System.out.println(player1.getName() + " final score: " + player1.getScore() + "\n");
		System.out.println(player2.getName() + " final score: " + player2.getScore() + "\n");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins! ⭐⭐⭐🏆⭐⭐⭐");
		} else if(player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins! ⭐⭐⭐🏆⭐⭐⭐");
		} else {
			System.out.println("It's a Draw!💣");
		}
	}
}