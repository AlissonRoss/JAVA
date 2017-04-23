/*
 * Alisson Leiva Salazar
 */
package phone;

import java.util.*;

import javax.swing.JOptionPane;

public class mainPhone {
	
	public static void main(String[] args){
		//ArrayList that will call in the PhoneBookEntry to retrieve the 
		//<object's> information in a ArrayList format
		ArrayList <PhoneBookEntry> phoneArray= new ArrayList<PhoneBookEntry>();
		
		//Predefined variables 
		String nameIn;
		long phoneIn;
		
		//Loop will iterate as long as boolean in check() is true
		do{
			//Name Input
			nameIn=JOptionPane.showInputDialog("Enter Name: ");
			
			//Phone Input: Initially String Data Type, Parsed into Long
			String phone=JOptionPane.showInputDialog("Enter Phone Number: ");
			phoneIn=Long.parseLong(phone);
			
			//Creates new PhoneBookEntry Object with the user Input
			PhoneBookEntry newEntry= new PhoneBookEntry(phoneIn,nameIn);
			
			//Adds the newEntry into the phoneArray to preserve the object's
			//elements in case of iteration
			phoneArray.add(newEntry);
			
		}while(PhoneBookEntry.check());
		
		//Prints out final entries after iteration
		JOptionPane.showMessageDialog(null, phoneArray);
	}

}
