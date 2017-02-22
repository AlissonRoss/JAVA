//*Alisson Leiva Salazar
package file;

import java.io.*;
import java.util.*;


public class file {
	private static Scanner readFile;

	public static void main(String [] args) throws IOException{
		int counter = 0;
		int sum=0;
		
		//Gets File and creates a Variable name
		File file= new File ("ListOfNumbers.txt");
		
		readFile = new Scanner(file);
		
		//Loop that reads each individual line in the file 
		while (readFile.hasNext()){
			//Converts each individual line in the file as a Integer Value
			int currentInt = readFile.nextInt();
			//Adds to the Counter each time Loop is ran
			counter ++;
			//Sums up the values together
			sum += currentInt;
			
		}
		//Division to calculate the Average of the Values
		int cal= (sum/counter);
		
		//Output
		System.out.println("\n Sum: \t"+sum+
				"\n Counter \t"+counter+
				"\n Average \t"+cal);
		
		//Appends to the File without rewriting the File
		PrintWriter fw = new PrintWriter(new FileWriter(file,true));
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("\n Sum: "+sum+"\n Counter:"+counter+
				"\n Average:"+cal);
		bw.close();
		
			
	}

}
