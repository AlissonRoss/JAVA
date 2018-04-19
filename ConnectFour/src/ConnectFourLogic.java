import java.util.Random;


//method boolean -call it with the most recent move and tells if that piece was in a winning pattern
//initializes board
public class ConnectFourLogic {
	//Initialize 
	final int colNum=7;
	final int rowNum=6;
	final int bottomRow= rowNum - 1;
	final char[][] board;
	
	char[] playerSymbols;
	
	
	//Clears board at the beginning of the game AND at the end
	public void clearBoard(){
		
		//loop across rowNum and colNum
		for(int row=0;row < rowNum;row++) {
			for(int col=0;col < colNum;col++) {
				
				board[col][row]=' ';	
			}	
		}
		
	}
	
	//CONSTRUCTOR - Passes in the player's choice of char
	public ConnectFourLogic(char one, char two) {
		playerSymbols = new char[] {one, two};
		
		board = new char[colNum][rowNum];
		clearBoard();
		
	}
	
	public void drawBoard() {
		//loop across rowNum and colNum
		for(int row=0;row < rowNum;row++) {
			for(int col=0;col < colNum;col++) {
				
				System.out.print(board[col][row]);
			}
			System.out.println();
		}
		System.out.println("0123456");
	}
	
	private boolean dropPiece(int column, int player) {
		for (int row = rowNum - 1; row >= 0; --row) {
			if (board[column][row]==' '){
				board[column][row] = playerSymbols[player];
	            return true;
			}
		}
		
		return false;
	}
	
	public boolean playerTurn(int column) {
		return dropPiece(column, 0);
	}
	
	//cpu makes move.  returns if cpu won 
	public boolean cpuTurn() {
		Random random = new Random();
		int column = random.nextInt(7);
		
		dropPiece(column, 1);
		return didWin(column);
	}
	
	//check the top row
	public boolean isBoardFull() {
		int columnsFull = 0;
		
		for (int column = 0; column < colNum; ++column) {
			if(board[column][0] != ' ') {
				++columnsFull;
			}
		}
		return (columnsFull == 7);
		
	}
	
	//vertically, diagonal or horizontal
	public boolean didWin(int col) {
		//start at the top of the board and "fall" downward until you find a non-air piece
		int row = 0;
		for (; row < rowNum; ++row) {
			if (board[col][row] != ' ') {
				break;
			}
		}
		

		char piece = board[col][row];
		
		
		//test for vertical matches
	
		int matches = 1;
	    for (int r = row + 1; r < rowNum; ++r) {
	      if (board[col][r] != piece)
	        break;
	      ++matches;
	    }
	    if (matches >= 4)
	      return true;

	    //test for horizontal matches
	    matches = 1;

	    //scan left
	    for (int c = col - 1; c >= 0; --c) {
	      if (board[c][row] != piece)
	        break;
	      ++matches;
	    }

	    //scan right
	    for (int c = col + 1; c < colNum; ++c) {
	      if (board[c][row] != piece)
	        break;
	      ++matches;
	    }

	    if (matches >= 4)
	      return true;

	    //test for '/' diagonal matches
	    matches = 1;

	    //scan left
	    for (int c = col - 1; c >= 0; --c) {
	      int r = row + (col - c);

	      if (r >= rowNum || board[c][r] != piece)
	        break;
	      ++matches;
	    }

	    //scan right
	    for (int c = col + 1; c < colNum; ++c) {
	      int r = row + (col - c);

	      if (r < 0 || board[c][r] != piece)
	        break;
	      ++matches;
	    }

	    if (matches >= 4)
	      return true;


	    //test for '\' diagonal matches
	    matches = 1;

	    //scan left
	    for (int c = col - 1; c >= 0; --c) {
	      int r = row - (col - c);

	      if (r < 0 || board[c][r] != piece)
	        break;
	      ++matches;
	    }

	    //scan right
	    for (int c = col + 1; c < colNum; ++c) {
	      int r = row - (col - c);

	      if (r >= rowNum || board[c][r] != piece)
	        break;
	      ++matches;
	    }

	    return (matches >= 4);
	}
}
