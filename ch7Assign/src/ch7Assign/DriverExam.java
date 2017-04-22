package ch7Assign;

public class DriverExam {
	//Array that will be initiated with 20 slots for the 
	//elements that will be passed in from the Main.java
	private String[] inputArray= new String[20];
	
	//Total Correct answers that the user gained
	private int correctAns;
		
	//Array with all the correct answers
	private String[] correctArray= {
			"B","D","A","A",
			"C","A","B","A",
			"C","D","B","C",
			"D","A","D","C",
			"C","B","D","A"		
	};
	
	
	
	//GETTERS/ACCESSORS
	public String[] getArray(){
		return this.inputArray;
	}
	
	//SETTERS/MUTATORS
	public void setArray(String[] array){
		inputArray=array;
	}
	
	
	//CONSTRUCTORS
	public DriverExam(String[] inputArray){
		this.inputArray=inputArray;
		
	}
	
	public boolean passed(){
		//Will iterate through correctArray to check if the elements from
		//inputArray correspond to one another
		for (int count=0;count < correctArray.length; count++){
			
			if(correctArray[count]==inputArray[count]){
				correctAns++;
			}
		}
		//returns Boolean whether the user passed
		//or failed the exam; the minimum to pass is 15
		if (correctAns >= 15){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public int totalCorrect(){
		//Returns the private variable that holds the total
		//of correct answers from the user
		return (correctAns);
		
	}
	
	public int totalIncorrect(){
		//Returns the correctAns minus the total possible
		//points
		return (20 - correctAns);
		
	}
	//integer based array Method to return which question numbers
	//were missed
	public int[] questionsMissed(){
		//Array that will hold the questions missed
		int[] missArray= new int [20];
		//Incorrect Answers
		int incorrectAns= 20-correctAns;
		
		//For Loop to iterate through the correctArray and checks
		//through a if loop which answer numbers were missed
		for(int count=0; count < correctArray.length; count++){
			//If the correctArray at the same position as inputArray's
			//does not match or correspond to one another, it will add
			//that position plus 1 to the missArray.
			if (correctArray[count]!=inputArray[count]){
				missArray[count]=count+1;
			}
		}
		
		return missArray;
		
	}

}
