package months;

public class Month {
	//Predefined private integer for the monthNumber
	private int monthNumber=0;

	
	
	//Accessor/Getter
	public int getMonthNumber(){
		
		return this.monthNumber;	
	}
	
	//Array that contains the Month names as String Data types.
	//It will return the monthName at the specified location through 
	//the monthNumber value -1 due to monthNumber's value being higher by 1
	//than the index 
	
	String getMonthName(){
		//Array that contains the months
		String[] monthNames= {"January","February","March","April",
				"May","June","July","August","September","October",
				"November","December"		
		};
		return monthNames[monthNumber -1];
					
	}
	

	//Mutator/Setter
	public void setMonthNumber(int month){
		//SETS inputNum to a Private, local scoped variable that is only available inside of the Month Class
		monthNumber=month;	
	}


	//Constructors
	
	//no Argument constructor that sets monthNumber to 1 
	public Month(){
		monthNumber=1;
	}
	
	public Month(int monthNumber) {
		
		this.monthNumber = monthNumber;
	}

	//toString Method : Converts integer value of monthNumber
	//to a String Data type named stringData
	
	public String toString(String stringData){
		stringData= Integer.toString(monthNumber);
		return stringData ;
		
	}
	
	//Comparison between object at the monthMain.java and month.java
	//returns boolean data type if conditions of the comparisons aren't met
	public boolean equalsTo(Month month){
		
		if (month.getMonthNumber() == this.monthNumber){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean greaterThan(Month month){
		if (month.getMonthNumber() > this.monthNumber){
			return true;
		}
		else{
			return false;
				
		}
		
		
	}
	
	public boolean lessThan(Month month){
		if(month.getMonthNumber() < this.monthNumber){
			return true;
		}
		else{
			return false;	
		}
	}
	
	
}
