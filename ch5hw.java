/**
 * @author Alisson Leiva Salazar
 */

import javax.swing.*;
import java.util.*;

public class ch5hw {
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String [] args){
		boolean tie=true;
		
		//Loop in case player and computer choice are tied
		do{
			String randInput= ranGen();
			String inputPlayer=inChoice();
			outComp(randInput);
			
			tie=outWinner(randInput,inputPlayer);
			
		}while(tie);
	}
	/**
	 * This method will generate random value and 
	 * will return the String that corresponds with the random value
	 * @return String Value of Computer Choice
	 */
	public static String ranGen(){
		int randValue;
		
		Random rand= new Random();
		randValue=rand.nextInt(3)+1;
		
		switch (randValue){
		case 1:
			return "rock";
		case 2:
			return "paper";
		default:
			return "scissors";
		}
	
	}
	/**
	 * This method will gather Player Input and
	 * will convert to Lower case if condition is met(Input Validation)
	 * @return
	 */
	public static String inChoice(){
		
		String inputPlayer=JOptionPane.showInputDialog("Enter your selection:"
				+"\n Rock"
				+"\n Paper"
				+"\n Scissors");
			inputPlayer=inputPlayer.toLowerCase();
			
		//If Statement to check Input Validation	
		do{
			
		}while ((!inputPlayer.equals("rock") && !inputPlayer.equals("paper")
				&& !inputPlayer.equals("scissors")));
		
		return inputPlayer;
	}
	
	/**
	 * This method prints Computer's Choice
	 * @param randInput- Computer Generated Choice
	 */
	public static void outComp(String randInput){
		JOptionPane.showMessageDialog(null, "\n Computer's Choice: \n"
				+randInput);
		
	}
	
	/**
	 * Method to compare both choices and determine winner!
	 * @param randInput - Computer's random choice
	 * @param inputPlayer - Player's choice
	 */
	public static boolean outWinner(String randInput, String inputPlayer){
		//Tie Statement
		if (randInput.equals(inputPlayer)){
			
			JOptionPane.showMessageDialog(null, "Tie!");
			//true means Tie
			return true;
		}
		//Winning Statement
		else if(inputPlayer.equals("rock") && randInput.equals("scissors")
				|| inputPlayer.equals("scissors") && randInput.equals("paper")
				|| inputPlayer.equals("paper") && randInput.equals("rock")){
			
			JOptionPane.showMessageDialog(null, "\nYou Won!!" );
			return false;
		}
		//Losing Statement
		else{
			
			JOptionPane.showMessageDialog(null, "\nYou Lost!");
			return false;
		}	
	}
}
