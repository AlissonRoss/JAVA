/**
 * Alisson Leiva Salazar
 */
package abstraction;

import javax.swing.JOptionPane;

public class bankMain {
	public static void main(String[] args){
		
		SavingsAccount acc1= new SavingsAccount(5,5,false,50,10);
		SavingsAccount acc2= new SavingsAccount(4,8,false,100,20);
		
		JOptionPane.showMessageDialog(null, "Account Status: ");
		acc1.deposit(100);
		acc1.withdraw(200);
		
		JOptionPane.showMessageDialog(null,
				
				"Balance: "
				+acc1.getBalance()
				+"\nActive?: "
				+acc1.getBool()
				+"\nExtra Total fee: "
				+acc1.monthlyProcess()
				+"");	
		
	}

}
