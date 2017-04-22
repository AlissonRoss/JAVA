package ch7Assign;

import javax.swing.JOptionPane;

public class mainExam {
	public static void main(String[] args){
		
		
		for(int count=0; count < 20; count++){
			String ansInput=JOptionPane.showInputDialog("Enter Letter Answered"
					+ "for "
					+(count+1)).toUpperCase();
		}
		
	
	}

}
