
import java.util.*;
/*
 * 
Connect Four is a two-player game in which the players first 
choose a color and then take turns dropping colored discs from the top into a seven-column, 
six-row vertically suspended grid. The pieces fall straight down, 
occupying the next available space within the column. 
The objective of the game is to be the first to form a horizontal, vertical, or diagonal line 
of four of one's own discs.

 
Write a program to simulate the connect 4 program. 
One player could be the computer, the other player could be the user.
 */
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
