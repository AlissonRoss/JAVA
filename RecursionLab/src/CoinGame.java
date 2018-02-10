import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Alisson Leiva Salazar
 */

public class CoinGame {
	
	public static void main(String[] main) {
		//Players
		String playerOne= "Alice";
		String playerTwo= "Bob";
		
		//Generate random value between 1 and 30 
		Random rand = new Random();
		int coinNum = rand.nextInt(30)+1;
		
		//will be used to display the winner depending on the coinNum
		String coinWinner=coinGame(coinNum, playerOne, playerTwo);
		
		//Displays the number of coins and the winner
		JOptionPane.showMessageDialog(null, "Number of Coins: "
				+coinNum+"\nThe Winner is "
				+coinWinner);
	}
	public static String coinGame(int coinNum, String playerOne, String playerTwo) {
		
		//switch case for coin choices
		int coinChoice = 0;
		
		switch(coinNum) {
		//base case of the recursion; tail call; end of recursion
		case 0:
			return playerTwo;
		case 1:
			coinChoice= 1;
			break;
		case 2:
			coinChoice= 2;
			break;
		case 3:
			coinChoice= 2;
			break;
		case 4:
			coinChoice= 4;
			break;
		default:
			Random rand = new Random();
			//generate random int between 1 and 3
			coinChoice = rand.nextInt(3) + 1;
			//translates sequence 1,2,3 to 1,2,4
			if (coinChoice == 3){
			    coinChoice = 4;
			}
			break;
		}
		//recurses with a fewer number of coins and players switched
		return coinGame(coinNum-coinChoice,playerTwo, playerOne);
	}

}
