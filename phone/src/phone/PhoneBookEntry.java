/*
 * Alisson Leiva Salazar
 */
package phone;

import javax.swing.JOptionPane;

public class PhoneBookEntry {
	//private predefined variables
	private long phoneIn;
	private String nameIn;
	
	//GETTERS/ACCESSORS
	public String getName(){
		return nameIn;
		
	}
	
	public long getNumber(){
		return phoneIn;
		
	}
	
	//SETTERS/MUTATORS
	public void setName(String name){
		this.nameIn=name;
		
	}
	public void setNumber(long phone){
		this.phoneIn=phone;
		
	}
	//CONSTRUCTORS
	public PhoneBookEntry(long phone, String name){
		this.phoneIn=phone;
		this.nameIn=name;
		
	}
	//toString will convert the elements into Strings and
	//will be sent to the ArrayList 
	public String toString(){
		String output=" Name: "
				+nameIn
				+"\nNumber: "
				+phoneIn
				+"\n";
		return output;
	}
	//Method that will return a boolean data type in case the user
	//wants to continue adding entries or not. Will be the catalyst for 
	//the do-while loop in the main method
	public static boolean check(){
		String input;
		do{
			input=JOptionPane.showInputDialog("Would you like to enter "
					+ "another entry?\n"
					+"yes/no");
			//Converts input into lower case
			input=input.toLowerCase();
		//do while until yes or no are entered	
		} while( !input.equals("yes") && !input.equals("no") );
		
		//returns true in case the input equals to "yes"
		if (input.equals("yes")){
			return true;
		}
		//else, return false
		else{
			return false;
		}
	}
}
