package exception;
/**
 * 
 * @author Alisson Leiva Salazar
 *
 */
public class Payroll {

	//PRIVATE DATA FIELDS
	 
	private String employeeName;
	private long idNumber;
	private double hourlyPayrate;
	private double totalHours;
	
	//Accessor/Getters
	public String getEmployeeName() {
		
		return this.employeeName;
	}
	public long getIdNumber() {
		
		return this.idNumber;
	}
	public double getHourlypayrate() {
		
		return this.hourlyPayrate;
	}
	public double getTotalhours() {
		
		return this.totalHours;
	}
	
	
	//Mutators/Setters
	public void setEmployeeName(String e) {
		
		this.employeeName=e;	
	}
	public void setIdNumber(long i) {
		
		this.idNumber=i;
		
	}
	public void setHourlyPayrate(double h) {
		
		this.hourlyPayrate=h;
		
	}
	public void setTotalHours(double t) {
		
		this.totalHours=t;
	}
	//CONSTRUCTORS
	
	//Default constructor
	public Payroll() {
		this.employeeName="";
		
		this.idNumber=0;
		
		this.hourlyPayrate=0;
		
		this.totalHours=0;
	}
	
	//Constructor that accepts employee's name and ID number as arguments
	
	public Payroll(String name, long id) {
		
		this.employeeName=name;
		
		this.idNumber=id;
	}
	//returns the gross pay
	public double getGrossPay() {
		double grossPay = hourlyPayrate*totalHours;
		return (grossPay);
		
	}
	
	
}
