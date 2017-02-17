
/**
 * @author Alisson Leiva Salazar */

import javax.swing.*;
public class hwch3 {
	public static void main(String [] args){
		
		double shipRate = 0;
		double shipPrice;
		
		String input1=JOptionPane.showInputDialog("Enter the weight of the package: ");
		double weightAmt = Double.parseDouble(input1);
		
		String input2 = JOptionPane.showInputDialog("Enter the number of miles that the package travelled: ");
		double milesAmt=Double.parseDouble(input2);
		
		if (weightAmt > 0 && milesAmt > 0){
			switch((int)Math.ceil(weightAmt)){
				case 1: case 2: 
					shipRate=1.10;	
					break;
				case 3: case 4: case 5: case 6:
					shipRate= 2.20;
					break;
				case 7: case 8: case 9: case 10:
					shipRate= 3.70;
					break;
				default:
					shipRate= 4.80;
					break;
					
			}
			if (milesAmt > 500){
				/* Rounds MilesAmt/500 up with Math.ceil(x) */
				shipPrice=(shipRate*Math.ceil(milesAmt/500));			
				JOptionPane.showMessageDialog(null,"Total Shipping Charges: $"+shipPrice);
			}
			
			else{
				JOptionPane.showMessageDialog(null, "Total: $"+shipRate);
			}
		
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Invalid Input: \n Input is Negative.");
			System.exit(0);
		}
		
		
		}
		
	}


