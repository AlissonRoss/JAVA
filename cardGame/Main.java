/*
 * Alisson Leiva Salazar
 */

package cardGame;
/*
 * Demonstrate these classes in an application that creates a Deck object, shuffles the cards it contains, 
and deals five cards from the Deck to a CardPlayer object. The CardPlayer should then display its cards.
 */
public class Main {
	 public static void main(String[] args) {
	        Deck deck1 = new Deck();
	        deck1.shuffleDeck();

	        CardPlayer player1 = new CardPlayer();

	        //give the player 5 cards
	        for (int i = 0; i < 5; ++i) {
	            player1.getCard(deck1.dealCard());
	        }

	        player1.showCards();
	    }

}
