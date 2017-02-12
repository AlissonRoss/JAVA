/**Assignment 2 Homework
 *Alisson Leiva Salazar
 *Question 2
 *2/3/2017
 */

package assignment2hw;
import javax.swing.*;

public class assign2ques2 {
	public static void main(String[] args){
	
		double custAmt= 12467 ;
		double energyPurch= 0.14;
		double citrusAmt= 0.64;
		double totalEnergy;
		double totalCitrus;
	
		totalEnergy= (custAmt * energyPurch);
		totalCitrus= (totalEnergy * citrusAmt);
		
		JOptionPane.showMessageDialog(null,
				"\n Number of customers who purchase one or more energy drinks: "
				+totalEnergy
				+"\n Number of customers who prefer citrus-flavor energy drinks: "
				+totalCitrus
				
				);
	
	}
}
