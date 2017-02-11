package ch3lab1;
import javax.swing.*;


public class ch3lab1 {
	
	public static void main(String[] args){
		
		double packageA = 9.95;
		double packageB = 13.95;
		double packageC =29.99;
		double total = 0;
		double savingsB;
		double savingsC;
		
		String packageLetter = JOptionPane.showInputDialog(null,
		"Enter the Letter of the Package: ");
		
		String packageHours=JOptionPane.showInputDialog(null,
				"Enter the amount of hours: ");
		Double hoursInt=Double.parseDouble(packageHours);
		
		/* String Statement with If Loop*/
		
		/*OUTER IF */
		if (packageLetter.equalsIgnoreCase("A")) {
			/* Checks for Hours entered*/
			if (hoursInt <= 10 && hoursInt > 0) {
				JOptionPane.showMessageDialog(null, 
						"\n Total for Package A: $" +packageA); }
			
			else if (hoursInt > 10) {
				
				total= packageA+((hoursInt*2.00)-20);
				
				JOptionPane.showMessageDialog(null,
						"\n Total Charge for hours with Package A: $"+total); }
			
				if (total > packageA){
					savingsB= (total - packageB);
					savingsC= (total - packageC);
					
					JOptionPane.showMessageDialog(null,
							"\n Savings if switched to Package B: $"+savingsB+
							"\n Savings if switched to Package C: $"+savingsC); }
							
			
			else {
				JOptionPane.showMessageDialog(null, 
						"\n Invalid amount of hours."); }
		}
		
		/*Outer Else If*/
		else if (packageLetter.equalsIgnoreCase("B")) {
			
			if (hoursInt <= 20 && hoursInt > 0){
				JOptionPane.showMessageDialog(null,
						"\n Total for Package B: $"+packageB);}
			
			else if (hoursInt > 20){
				total= packageB+((hoursInt*1.00)-20);
				
				JOptionPane.showMessageDialog(null,
						"\n Total Charge for hours with Package B: $"+total);}
				if (total > packageB){
					savingsC= (total - packageC);
				
					JOptionPane.showMessageDialog(null,
							"\n Savings if switching to Package C: $"+savingsC); }
		
			else{
				JOptionPane.showMessageDialog(null, 
						"\n Invalid amount of hours");}
			
		}
		else if (packageLetter.equalsIgnoreCase("C"))
			if (hoursInt <= 30 && hoursInt > 0 || hoursInt > 30){
			JOptionPane.showMessageDialog(null, 
					"\n Total for unlimited hours package: $"+packageC);
			}
			else {
				JOptionPane.showMessageDialog(null, 
						"Invalid amount of hours");}
				
			
			
		/*Outer ELSE */
		else{
			JOptionPane.showMessageDialog(null, 
					"\n Invalid");
		}
	
		
	
	}		

}
