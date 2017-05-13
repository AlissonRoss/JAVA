package officer;

import javax.swing.JOptionPane;

public class PoliceOfficer {
	//Private Data Fields
	private String officerName;
	private int badgeNum;
	
	//GETTER
	public String getOfficerName(){
		return this.officerName;
	}
	public int getBadgeNum(){
		return this.badgeNum;
	}
	//CONSTRUCTOR
	public PoliceOfficer(String name, int badge){
		this.officerName=name;
		this.badgeNum=badge;
		
	}

	public void timeCheck(ParkedCar car, ParkingMeter meter){
		//Compares the minutes the car has been parked with the purchased amount of 
		//minutes. If condition is true, it'll create a new ticket object
		if (car.getCarMins() > meter.getPurch()){
			
			ParkingTicket ticket= new ParkingTicket(car,this,meter);
			JOptionPane.showMessageDialog(null,ticket.toString());
		}
		else{
			JOptionPane.showMessageDialog(null, "No Fine to be Issued.");
		};
			
	}
	
	
}
