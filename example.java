import javax.swing.*;
import java.util.*;
public class example {

	public static void main(String[] args) {
		double input;
		double total = 0;
		//Generates Empty Double Array
		ArrayList<Double> myArray = new ArrayList<Double>();
		do {
			//Input will be entered as String Value Type
			String someInput = JOptionPane.showInputDialog("\nEnter a positive number");
			//Conversion from String to Double Value Type
			input = Double.parseDouble(someInput);
			//Adds Value entered into Array
			myArray.add(input);
			
		} while(input > 0);
		
		for (int counter=0; myArray.size() > counter; counter++){
			total +=myArray.get(counter);
		}
		
		JOptionPane.showMessageDialog(null,"\nTotal:"+total);
	
	}

}
