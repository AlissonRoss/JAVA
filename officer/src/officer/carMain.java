package officer;

import javax.swing.JOptionPane;

public class carMain {
	public static void main(String [] args){
		
		//Car Object
		ParkedCar car1= carInput();
	
		//Meter Object
		ParkingMeter meter1= meterInput();
	
		//Officer Object
		PoliceOfficer officer1=officerInput();
		
		officer1.timeCheck(car1,meter1);
		
		
		
	}
	
	
	public static ParkedCar carInput(){

		//Input in order to identify the Vehicle object
		String make=JOptionPane.showInputDialog("Enter Vehicle's Make: ");
		
		String model=JOptionPane.showInputDialog("Enter Vehicle's Model: ");
		
		String color=JOptionPane.showInputDialog("Enter Vehicle's Color: ");
		
		String license=JOptionPane.showInputDialog("Enter License Number: ");
		
		
		String carMins=JOptionPane.showInputDialog("Enter amount of minutes the vehicle has "
				+ "been parked: ");
		double parkMins=Double.parseDouble(carMins);
		
		//Create new ParkedCar Object
		ParkedCar car1=new ParkedCar(make,model,color,license,parkMins);
		return car1;
	}	
	
	
	public static ParkingMeter meterInput(){
	
		//Input to generate ParkingMeter Object
		String pMins=JOptionPane.showInputDialog("Enter Purchased Minutes: ");
		double meter=Double.parseDouble(pMins);
		
		//Create a new ParkingMeter Object
		ParkingMeter meter1=new ParkingMeter(meter);
		return meter1;
		
	}
	
	public static PoliceOfficer officerInput(){
		
		//Input for Cop identification
		String name=JOptionPane.showInputDialog("Enter Officer's name: ");
		
		String badgeNum=JOptionPane.showInputDialog("Enter the Badge Number: ");
		int badge=Integer.parseInt(badgeNum);
		
		//Create a new PoliceOfficer Object
		PoliceOfficer officer1=new PoliceOfficer(name,badge);
		
		return officer1;
		
	}

}
