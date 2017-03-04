//Alisson Leiva Salazar
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.*;

public class LAB5Online {
	public static void main(String [] args) throws FileNotFoundException{
		int ranYears=randValue();
		double outRain=calRain(ranYears);
		int totalMonths=ranYears*12;
		double avRain= outRain/totalMonths;
		
		printingOut(ranYears, outRain, avRain);
	}
	//Returns random Value to Main
	public static int randValue() {
		int randValue;
		
		Random rand= new Random();
		randValue=rand.nextInt(10)+1;
		
		return randValue;
	}
	
	public static double calRain(int ranYears){
		//ranYears is defined in Main
		double totalRain=0;
		
		int countYears=1;
		
		if (ranYears > 0 && ranYears < 10){
			
			int countMonths=1;
			//Loops through Years and Increment the value
			while (countYears <= ranYears){
				
				//Loops through Months and Increment the value
				while (countMonths <= 12){
					
					double doubRain;
					do{
						String monthAmt=JOptionPane.showInputDialog("\nEnter the amount of inches of rainfall for month "+countMonths+
								" in year #"+countYears);
						doubRain=Double.parseDouble(monthAmt);
						
					}while(doubRain < 0);
					countMonths +=1;
					totalRain+=doubRain;
				}
				
				countMonths=1;
				countYears +=1;		
			}
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Invalid Random Value");
			System.exit(0);
		}
		return totalRain;
	}
	
	public static void printingOut(int years, double rain, double avrain ) throws FileNotFoundException{
		String resultMessage = "\nTotal years: "+years+"\nTotal RainFall: "+rain+
				"\nAverage Rainfall: "+avrain;
				
		JOptionPane.showMessageDialog(null, resultMessage);
		
		PrintWriter writer = new PrintWriter("rainfall.txt");
		writer.println(resultMessage);
		writer.close();
	}
	
}