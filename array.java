package lab;
import javax.swing.*;

public class array {
	public static void main(String [] args){
		int [] array= new int [10];
		int sum=0;
		//For loop that initiates the counter to 0
		//Checks if the condition of count < array's length is met
		//and increments the counter
		for(int count=0;count < array.length;count++){
			
			String var=JOptionPane.showInputDialog("Enter 10 values.\n"
					+ "Enter value #"
					//Array Position 0, but Input Value will be
					//1 in the dialog
					+(count+1)
					+":");
			//Converts String input into an Integer value
			int val=Integer.parseInt(var);
			//Assigns value into the position inside the array
			array[count]=val;
			
			}
		//Enhanced-For loop to iterate through the array and print
		//the values in such current position of the array
		for(int arrayVal : array){
		
			//If statement to check if the int values inside of the array are
			//positive values and if so, it'll print that value
			if (arrayVal >= 0){
				JOptionPane.showMessageDialog(null, "Positive: "
						+arrayVal);
				//Sums to the total
				sum+=arrayVal;
			}
		}
		//Prints Total of Positive Values
		JOptionPane.showMessageDialog(null, "Total:"+sum);
	}

}
