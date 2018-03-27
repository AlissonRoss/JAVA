package cardGame;
/*
 * Alisson Leiva Salazar
 */
public class Card {
	String[] suitA= {"Hearts","Diamonds","Spades","Clubs"};
	String[] faceA= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	private int suit;
	private int face;
	
	public Card(int s, int f) {
		
		this.suit=s;
		this.face=f;
		
	}
	public String toString() {
		return ("Face: "
				+faceA[face]
				+" Suit: "
				+suitA[suit]);
	}

}
