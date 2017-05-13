package officer;

public class ParkingTicket {
	
	//Private ParkedCar Object
	private ParkedCar car;
	
	//Private PoliceOfficer Object
	private PoliceOfficer officer;
	
	//Private ParkingMeter Object
	private ParkingMeter meter;
	
	//GETTER
	public double getFine(){
		//Fees
		double hourFee=10.0;
		double baseFee= 25.0;
		//Total Calculation with conversion to hours
		double parkFineTotal=Math.floor((car.getCarMins()/60))*hourFee+baseFee;
		return parkFineTotal;
		
	}
	//CONSTRUCTOR
	//Constructs Car/Cop object
	public ParkingTicket(ParkedCar c, PoliceOfficer o, ParkingMeter m){
		this.car=c;
		this.officer=o;
		this.meter=m;

	}
	
	//ToString Method that'll return the Vehicle's information
	public String toString(){
		String outCar=" Car Make: "
				+car.getCarMake()
				
				+"\nCar Model: "
				+car.getCarModel()
				
				+"\nCar Color: "
				+car.getCarColor()
				
				+"\nLicense Number: "
				+car.getLicenseNum()
				
				+"\nMinutes Parked: "
				+car.getCarMins()
				
				+"\nMinutes over: "
				+(car.getCarMins()-meter.getPurch())
				
				+"\nOfficer's Name: "
				+officer.getOfficerName()
				
				+"\nBadge Number: "
				+officer.getBadgeNum()
		
				+"\nParking Fine Total: "
				+"$"
				+this.getFine();
		
		return outCar;
	}

}
