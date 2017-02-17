package lab4;
//* Alisson Leiva Salazar
import java.util.*;
import javax.swing.*;

public class lab4 {
	public static void main(String [] args){
		double randomYear;
		double monthAmt= 1;
		double doubRain=0;
		double monthTotal=0;
		double avRain;
		
		Random rand= new Random();
		randomYear=rand.nextInt(5)+1;
		
		if (randomYear > 0 && randomYear < 5){
			
			int yearCount = 1;
			
			while (yearCount <= randomYear){
				
				while (monthAmt <= 12){
					String inputRain = JOptionPane.showInputDialog("Enter the amount of inches of rainfall for month " +monthAmt+
							" of Year #"+yearCount);
					
					doubRain=Double.parseDouble(inputRain);
					
					if (doubRain > 0){
					
					
						doubRain+=doubRain;
					
					}
					else{
						JOptionPane.showMessageDialog(null,"Invalid Input: \n Input was Negative");
						System.exit(0);
					}
					
					monthAmt +=1;
					monthTotal +=1;
				}
				
				monthAmt = 1;
				yearCount++;
			}
			
			
		}
	
		else{
			JOptionPane.showMessageDialog(null,"Invalid Random Value");
			System.exit(0);
		}
		
		avRain=doubRain/(12 * randomYear);
		
		JOptionPane.showMessageDialog(null, " \n Number of Months: "+ monthTotal+
					"\n Total Inches of Rain: "+doubRain+
					"\n Average Rain Fall: "+avRain);
		
		
	}

}
