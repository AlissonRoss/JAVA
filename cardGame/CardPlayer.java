package cardGame;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * Alisson Leiva Salazar
 * 
 * Next, Write a CardPlayer class. 
This class should keep a list of Card objects that have been dealt to it. 
This represents a hand of cards. 
A method named getCard should accept a reference to a Card object, which is added to the list.
A method named showCards displays the Card objects in the list.

 */
public class CardPlayer {
	 ArrayList<Card> handList = new ArrayList<>();

	 public void getCard(Card card) {
		 
	    handList.add(card);
	 }

	 public void showCards() {
		 for (Card card : handList) {
			 
			 JOptionPane.showMessageDialog(null, "Player's hand: "+card);
		 }
	   
	 }

}
