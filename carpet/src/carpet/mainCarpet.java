/*
 * Alisson Leiva Salazar
 */
package carpet;

import javax.swing.JOptionPane;

public class mainCarpet {
	public static void main(String[] args){
		
		String lenght=JOptionPane.showInputDialog("Enter the length: ");
		//Parse String input to Double Data Type
		double lengthIn=Double.parseDouble(lenght);
		
		String width=JOptionPane.showInputDialog("Enter the width: ");
		//Parse String Input to Double Data Type
		double widthIn=Double.parseDouble(width);
		
		RoomDimension room=new RoomDimension(lengthIn,widthIn);
		
		JOptionPane.showMessageDialog(null,room.toString());
		
		
	}
}
