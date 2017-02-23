//Alisson Leiva Salazar
package ch4hw;
import javax.swing.*;

public class ch4hw {
	
	
	public static void main(String [] args) {
		
		int count=0;
		double countRooms=0;
		double countOccRoom=0;
		double rateOcc;
		double vacantRoom;
		
		String inputFloor = JOptionPane.showInputDialog("\n Input number of floors in the hotel: ");
		int floorAmt= Integer.parseInt(inputFloor);
		
		//While Loop to check if the Count is less than inputFloor
		
		while (count < floorAmt) {
			
			//Loop to display error message if invalid number is inputed
			
			if (floorAmt >= 1) {
			
			//Input for room in each Floor
			String roomInput=JOptionPane.showInputDialog("\n Input numbers of room on Floor #"+count+
					"\n Value Should be no less than 10.");
			
			double roomAmt=Double.parseDouble(roomInput);
			
				//Loop that checks Valid Room input
			
				if (roomAmt >=10 ) {
					
					countRooms +=roomAmt;
					//Input for Occupied Rooms
					
					String occInput=JOptionPane.showInputDialog("\n Input the amount of occupied rooms on Floor #"+count);
					double occAmt=Double.parseDouble(occInput);
					
					//Checks if the amount of Occupied rooms does not surpass the total amount of Rooms in that Floor!
					if (roomAmt >= occAmt) {
						countOccRoom+=occAmt;
						
						
					}
					
					else {
						JOptionPane.showMessageDialog(null,"\n Value should be equal to or less than the amount of Rooms.");
						System.exit(0);
					}
				}
					
		
			
				else {
					
					JOptionPane.showMessageDialog(null, "\n Value should be equal or greater than 10.");
					System.exit(0);
				}
			
			}
			else {
				JOptionPane.showMessageDialog(null, "\n Invalid Input");
				System.exit(0);
				
				}
			
			count ++;
			
			
			}
		rateOcc=countOccRoom/countRooms;
		vacantRoom=countRooms-countOccRoom;
		
		JOptionPane.showMessageDialog(null, "\nTotal Floors:\t"+count+
				"\nTotal Rooms:\t"+countRooms+
				"\nTotal Occupied Rooms:\t"+countOccRoom+
				"\n Total Vacant Rooms: \t"+vacantRoom+
				"\nOccupancy Average: \t"+rateOcc+"%");
		
	}
	
}
