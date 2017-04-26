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
		String cost=JOptionPane.showInputDialog("Enter cost: ");
		double costIn=Double.parseDouble(cost);
		
		RoomDimension roomDim=new RoomDimension(lengthIn,widthIn);
		RoomCarpet roomCar=new RoomCarpet(roomDim, costIn);
		
		JOptionPane.showMessageDialog(null,roomDim.toString()
				+"\n"
				+roomCar.toString());
		
		
	}
}
