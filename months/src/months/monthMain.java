/**
 * Alisson Leiva Salazar
 */
package months;

import javax.swing.JOptionPane;

public class monthMain {
	
	public static void main(String[] args){
		
		Month month1= new Month(6);
		Month month2= new Month("January");
	
		JOptionPane.showMessageDialog(null,"1st Month: "
				//getMonthName to get the stringData
				+month1.getMonthName()
				+" "
				+month1.getMonthNumber()
				+"\n2nd Month: "
				+month2.getMonthName()
				+" "
				//getMonthNumber to get the int value
				+month2.getMonthNumber());
			
	}

}
