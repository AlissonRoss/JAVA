package months;

public class Month {
	//Predefined private integer for the monthNumber
	private int monthNumber=0;
	
	//Accessor/Getter
	public int getMonthNumber(){
		
		return this.monthNumber;	
	}
	
	public String getMonthName(){
		//Switch that returns the string with the corresponding cases
		switch (monthNumber){
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		default:
			return "December";	
		
		}
	
	}
	
	
	//Mutator/Setter
	public void setMonthNumber(){
		//SETS inputNum to a Private, local scoped variable that is only available inside of the Month Class
		monthNumber=inputNum;	
	}


	//Constructor 
	
	//MonthNumber becomes 1 to correspond to the values for the switch
	public Month(){
		monthNumber=1;
	}
	
	
	public Month(int monthNumber) {
		
		this.monthNumber = monthNumber;
	}
	
	//toString Method 
	
	public String toString(String stringData){
		stringData= Integer.toString(monthNumber);
		return stringData ;
		
	}
	
	public boolean equalsTo(){
		if (){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean greaterThan(){
		if (){
			return true;
		}
		else{
			return false;
				
		}
		
		
	}
	
	public boolean lessThan(){
		if(){
			return true;
		}
		else{
			return false;	
		}
	}
	
	
}
