import java.util.Scanner;

import java.util.*;
public class CH5LAB {
/** Alisson Leiva
 * This Program simulates a slot machine. 
 * User puts money into the machine 
 * And the Machine generates three words(to indicate images)
 * the Machine will calculate and display the reward
 * Game will be repeated until the user says no */
	
public static void main(String [] main){
	
	char answer;
	double bet;
	String word1, word2, word3;
	
	do {
		
	// get the bet
		//Bet is a BLOCK variable
		bet= getBet();
	//select the three words
		word1=selectWord();
		word2=selectWord();
		word3=selectWord();
		
		System.out.println(word1+" "+ word2+ " "+word3);
	//play
		play(bet, word1, word2, word3);
	//ask if repeat
		answer= again();
		
		
	} 
	while(answer == 'y');
	
	}
	/** This method gets the amount of bet for the game
	 * @return the amount of debt
	 
	 */
	public static double getBet(){
		Scanner myInput= new Scanner(System.in);
		
		System.out.print("Enter the amount of bet: ");
		
		double bet = myInput.nextDouble();
		
		while (bet <=0 || bet > 100)
		{
			System.out.println("The bet cannot be over $100");
			System.exit(0);
		}
			return bet;
		
		
	}
	/** This Method returns the word selected
	 @return the word selected
	 */
	public static String selectWord(){
		String word;
		Random rand= new Random();
		
		//Generate a random Integer from 0 to 5
		
		int number = rand.nextInt(6);
		
		switch (number)
		{
		case 0:
			word= "Cherry";
			break;
		case 1:
			word="Orange";
			break;
		case 2:
			word="Plum";
			break;
		case 3:
			word= "Melon";
			break;
		case 4:
			word ="Bar";
			break;
		default:
			word="Apple";
			break;
		}
		
		
		return word;
	}
	
	/**
	 * This method calculates and displays the reward information
	 * @param bet the amount of bet
	 * @param w1 the first word
	 * @param w2 the second word
	 * @param w3 the third word
	 */
	public static void play(double bet, String w1, String w2, String w3){
		
		double bonus;
		
		if (w1.equals(w2) && w2.equals(w3)){
			bonus =bet*3;
			
		}
		else if (w1.equals(w2) || w1.equals(w3) || w2.equals(w3)){
			bonus = bet * 2;
					
		}
		else {
			bonus=0;
		}
		//Display
		
		if (bonus == 0){
			System.out.println("\n Oops! You lost your bet!");
		}
		else{
			System.out.println("\n Good Job! You got $"+bonus+" back!");
		}
		
	}
	
	/**
	 * This method asks the user if they want to repeat
	 * @return 
	 @return the response
	 */
	public static char again(){
		Scanner myInput = new Scanner(System.in);
		char response;
		
		System.out.print("\n Want to play again? \n (Y for yes/ N for no) ?:");
		
		response = myInput.nextLine().toLowerCase().charAt(0);
		
		//What if the response is not, y, or n
		
		while (response != 'y' && response != 'n'){
			System.out.println("The response can only be Y/y or N/n.");
			System.out.print("\n Want to play again? \n (Y for yes/ N for no) ?:");
			
			response = myInput.nextLine().toLowerCase().charAt(0);
		}
		return response;
		
	}
}
