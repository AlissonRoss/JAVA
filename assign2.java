package assignment2;

import java.util.*;

public class assign2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payAmount;
		double payPeriods= 26.0;
	    double annualPay;
	    double bonusPay;
	    double totalPay;
	      
	    Scanner input=new Scanner(System.in);
	      
	    System.out.println("Enter the amount of pay the employee earns:");
	    payAmount= input.nextDouble();
	    
	    
	    annualPay= (payAmount*payPeriods);
	    bonusPay= (0.05*annualPay);
	    totalPay=(bonusPay+annualPay);
	    
	    System.out.println("\nAnnual Pay: $"+annualPay+"\n Bonus Pay: $"+bonusPay+"\n Total Pay: $"+totalPay);
	    
	    
	      
	    		  
	}

}
