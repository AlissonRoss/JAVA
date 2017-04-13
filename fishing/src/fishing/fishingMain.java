package fishing;
import javax.swing.*;

/**
 * For this assignment, you will write a program that simulates a fishing game. 
 * In this game, a six-sided die is rolled to determine what he user has caught. 
 * Each possible item is worth a number of fishing points. 
 * The points will remain hidden until the user is finished fishing, and then a message 
 * is displayed congratulating the user, depending on the number of fishing points gained.
 */
/**
 * 
 * @author Alisson Leiva Salazar
 *
 */
public class fishingMain {
	//Main Method
	public static void main(String [] args){
		
		//Boolean set to False until the condition is true,
		//the do-while loop will iterate again
		boolean play = false;
		
		//Tracks Rounds
		int round=0;
		
		//Tracks Total
		int total=0;
		
		//Main Screen
		JOptionPane.showMessageDialog(null,"Fishing Game!");
		//Iterates do-while loop if boolean is true
		do{
			
			//Makes a new Child from the Die Parent class
			Die newDice = new Die(6);
			
			//Referencing Roll for pricesSwitch and to 
			//get String Data for output of prices
			
			int roll=newDice.getValue();
			
			//Retrieved String Data from the Dice roll amount
			//and the Switch statement
			String price=pricesSwitch(roll);
			
			//Adds the roll amount to the total value
			total+=roll;
			
			//Output of Rounds, the Dice Value and the Price corresponding to
			//such price
			JOptionPane.showMessageDialog(null, "Dice Roll!:\n"
					+ "Round # "
					+(round+=1)
					+":\n"
					+newDice.getValue()
					+"\n"
					+price);
			
		}while(tryAgain());
		
		JOptionPane.showMessageDialog(null, "Total Score:\n"
				+total);
		
	}
	//Asks the user if they want to play again
	//returns Boolean Data type true if 
	//do-while loop is no longer meeting the condition
	public static boolean tryAgain(){	
				
		String input;
		do{
			input=JOptionPane.showInputDialog("Would you like to play again?\n"
					+"yes/no");
			input=input.toLowerCase();
		//do while input is not equal to yes or no inputs	
		} while( !input.equals("yes") && !input.equals("no") );
		
		if (input.equals("yes") ){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static String pricesSwitch(int roll){
		
	//String price will be returned
	String price;
	//The switch will be using the Dice roll value to
	//retrieve the corresponding String Output
	switch (roll){
		case 0:
			price= "Old Boot";
			break;
		case 1:
			price= "Stinky Eel";
			break;
		case 2:
			price= "Tiny Fishie";
			break;
		case 3:
			price= "Medium Eel";
			break;
		case 4:
			price= "Biggie Fish";
			break;
		case 5:
			price= "Behemoth Fish";
			break;
		default:
			price= "Amazing Bass";
			break;
		}
	return price;
	}
	
}
