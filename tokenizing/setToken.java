/*
 * Alisson Leiva Salazar
 */

package tokenizing;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class setToken {

	
	public static void main(String[] args) throws IOException {
		uniqueWord();
		
	}
	private static void uniqueWord() throws IOException {
			
		try {
			// input stream for reading data from a file
			FileInputStream fileStream= new FileInputStream("file1.txt");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
			
			
			//read a line into a variable, check if the variable is not null, 
			//then print the var line
			 String line;
	         while ((line = reader.readLine()) != null)  {
	        	 
	        	 String[] tokenizer=line.split(" ");
	        	 
	        	 TreeSet<String> tokenSet = new TreeSet<>(Arrays.asList(tokenizer));
	        	 
	        	 for (String i: tokenSet) {
                     
	                    JOptionPane.showMessageDialog(null,"Tokenized Ouput: "+ i);
	                }
	        	
			}
			
		}
				
		catch(FileNotFoundException e) {
						
			//Tells the user where the working directory is at.		
			String workingDirectory = new File(".").getAbsolutePath();
				
			//Exception		
			JOptionPane.showMessageDialog(null, "FileNotFoundException: "
						
					+ "\"file1.txt\" not found in \n" 
					
					+ workingDirectory);		
		}	
		catch (IOException e) {
			e.printStackTrace();
	    }
		
				
	}
	
}
