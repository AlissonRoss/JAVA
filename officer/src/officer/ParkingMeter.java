package officer;

public class ParkingMeter {
	private double purchMins;
	
	//Getter
	public double getPurch(){
		return this.purchMins;	
	}
	
	//Constructors 
	public ParkingMeter(){
		this.purchMins=0.0;
	}
	
	public ParkingMeter(double purch){
		this.purchMins=purch;
		
	}

}
