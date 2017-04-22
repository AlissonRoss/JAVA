package ch7Assign;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class mainExam {
	public static void main(String[] args){
		//Array that will keep track of the user input while iteration of the
		//for and do-while loop.
		String[] studentAns=new String[20];
		
		for(int count=0; count < 20; count++){
			//Initialized answer Input variable so the do-while
			//loop will iterate correctly
			String ansInput;
			
			do{
				ansInput=JOptionPane.showInputDialog("Enter Letter Answered"
					+ " for Question # "
					+(count+1)).toUpperCase();
				
				//Adds new String element from
				//input inside the studentAns array
				studentAns[count]=ansInput;
				
			}while(!ansInput.equals("A") && !ansInput.equals("B")
					&& !ansInput.equals("C") && !ansInput.equals("D"));
		}
		
		//Creates a new object out of the DriverExam Parent
		//and sends the studentAns array to the parent
		DriverExam exam= new DriverExam(studentAns){};
		
		if(exam.passed()){
			JOptionPane.showMessageDialog(null, "The Student Passed"
					+ " the Exam"
					+ "\nTotal Correct: "
					+exam.totalCorrect()
					+"\nTotal Incorrect: "
					+exam.totalIncorrect()
					+"\nMissed Questions: "
					+exam.questionsMissed());
		}
		else{
			JOptionPane.showMessageDialog(null, "The Student Failed"
					+ " the Exam"
					+ "\nTotal Correct: "
					+exam.totalCorrect()
					+"\nTotal Incorrect: "
					+exam.totalIncorrect()
					+"\nMissed Questions: "
					+Arrays.toString(exam.questionsMissed()));
		}
	
	}

}
