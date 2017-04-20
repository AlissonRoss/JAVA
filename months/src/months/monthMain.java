/**
 * Alisson Leiva Salazar
 */
package months;

import javax.swing.JOptionPane;

public class monthMain {
	
	public static void main(String[] args){
		
		Month month1= new Month(1);
		Month month2= new Month("June");
	
		JOptionPane.showMessageDialog(null,"Month: "
				+month1.getMonthName()
				+"\nMonth: "
				+month2.getMonthNumber());
			
	}

}
