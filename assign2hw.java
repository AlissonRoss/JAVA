/** Assignment 2 Homework
*Alisson Leiva Salazar
*Question 1
*2/3/17
*/ 
package assignment2hw;
import javax.swing.*;

public class assign2hw {
	
	public static void main(String[] args) {
		
		//String for conversion//
		String purchAmtStr;
		//Double Value for conversion//
		double purchAmt;
		double totalTax;
		double totalSales;
		double stateTax=0.04;
		double countyTax=0.02;
		
		
		
		//Input as a String//
		purchAmtStr= JOptionPane.showInputDialog("Enter purchase Amount:");
		//Converting String to Double and appending it to the Double value//
		purchAmt=Double.parseDouble(purchAmtStr);
		
		
		totalTax= (purchAmt*stateTax)+(purchAmt*countyTax) ;
		totalSales= totalTax+purchAmt;
		
		
		JOptionPane.showMessageDialog(null, 
				"\n Amount of purchase: $"+purchAmt+
				"\n State Sales Tax: %"+stateTax+
				"\n County Sales Tax: %"+countyTax+
				"\n Total Sales Tax: $"+totalTax+
				"\n Total Sales Amount: $"+totalSales);
	}

}
