package officer;

public class ParkedCar {
	//PRIVATE DATA FIELDS
	private String carMake;
	private String carModel;
	private String carColor;
	private String licenseNum;
	private double carMins;
	
	//GETTERS/ACCESSORS
	public String getCarMake(){
		return this.carMake;
	}
	public String getCarModel(){
		return this.carModel;
	}
	public String getCarColor(){
		return this.carColor;
	}
	public String getLicenseNum(){
		return this.licenseNum;
	}
	public double getCarMins(){
		return this.carMins;
	}
	
	//CONSTRUCTORS
	public ParkedCar(){
		this.carMake="";
		this.carModel="";
		this.carColor="";
		this.licenseNum="";
		this.carMins=0;
	}
	
	public ParkedCar(String make, String model, String color, String num, double mins){
		this.carMake=make;
		this.carModel=model;
		this.carColor=color;
		this.licenseNum=num;
		this.carMins=mins;
		
	}

	
}
