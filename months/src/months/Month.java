/*
 * Alisson Leiva Salazar
 */
package months;

public class Month {
	//Predefined private integer for the monthNumber
	private int monthNumber=0;

	//ACCESSORS/GETTERS
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
		//returns the month name as String, while the position is minus 1
		return monthNames[monthNumber -1];
					
	}
	

	//MUTATORS/SETTERS
	public void setMonthNumber(int month){
		//SETS inputNum to a Private, local scoped variable that is only available inside of the Month Class
		monthNumber=month;	
	}


	//CONSTRUCTORS 
	
	//1st) no Argument constructor that sets monthNumber to 1 
	public Month(){
		monthNumber=1;
	}
	//2nd)
	public Month(int monthNumber) {
		
		this.monthNumber = monthNumber;
	}
	
	//3rd) Constructor that will take in stringData into the Month.java
	//It checks through a for loop if the monthName in the count (position)
	//corresponds to the stringData from the main method
	//it'll then assign monthnumber to count+1
	public Month(String stringData){
		String[] monthNames= {"January","February","March","April",
				"May","June","July","August","September","October",
				"November","December"		
		};
		
		for (int count = 0;count < monthNames.length;count++){
			
			if(monthNames[count]==stringData){
				monthNumber= count+1;
			}
				
		}
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
