/*
 * Alisson Leiva Salazar
 */
import java.util.*;

public class ConnectFour {
	
	//Symbols
	final char red='@';
	final char blue='X';
	
	public static void main(String[] args) {
		
		ConnectFourLogic game=new ConnectFourLogic('#','O');
		
		game.drawBoard();
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			//repeatedly ask the user for a move until they enter a valid one
			int column;
			do {
				System.out.print("Enter column number: ");
				column = inputColumn(input);
			} while (!game.playerTurn(column));
			
			if (game.didWin(column)) {
				game.drawBoard();
				System.out.println("Player 1 won");
				break;
			}
			
			if (game.cpuTurn()) {
				game.drawBoard();
				System.out.println("Player 2 won");
				break;
				
			}
			game.drawBoard();
			
			if (game.isBoardFull()) {
				//tied game
				System.out.println("Tie Game. Game will start again.");
				game.clearBoard();
			}
		}
	}
	
	//Gets user input
	 private static int inputColumn(Scanner keyboard) {
	    while (true) {
	        String line = keyboard.nextLine();
	        char first = (line.length() == 0) ? ' ' : line.charAt(0);
	        if (first >= '0' && first <= '6') {
	            return first - '0';
	            }
	
	        System.out.print("Enter a number between 0 and 6: ");
	    }
	}

}
