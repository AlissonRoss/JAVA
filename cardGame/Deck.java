package cardGame;

import java.util.*;

/*
 * Alisson Leiva Salazar
 */
public class Deck {
	ArrayList<Card> cardList = new ArrayList<>(52);
	
	public Deck() {
		//Suit
		for(int s = 0; s < 4; ++s) {
			//Face
			for(int f = 0; f < 13; ++f) {
				//Create new Card
				cardList.add(new Card(s,f));
			}
		}
	}
	
	public void shuffleDeck() {
		//Shuffle Deck
		Collections.shuffle(cardList);
		
	}
	public Card dealCard() {
		//returns a card that is essentially removed from the beginning of the list
		return cardList.remove(0);
		
	}

}
