package encryption;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class FileEncryption {
	//File encryption and decryption:
	
	public static void main(String [] args) {
		//because encryptFile is defined within the same .java file, then there's no need to specify more.
		
		encryptFile();
		
	}
	
	//File encryption is the science of writing the contents of a file in a secret code. 
	
			//Your encryption program should work like a filter, reading the contents of one file, modifying the data into a code, 
			//and then writing the coded contents into a second file. 
			//The second file will be a version of the first file, but written in a secret code.
			
			

			//Although there are complex encryption techniques, you should come up with a simple one of your own. 
			//For example, you can read the first file one character at a time, and add 100 to the character code of 
			//each character before it is written to the second file.

			//Then write a program to decrypt the second file. 
			//The program should read the content of the second file, restore the data to its original state, and write to a third file.

	//static: do not need to create instances. 
	private static void encryptFile() {
		
		DataInputStream dataStream= null;
		
		while(true) {
			try {
				//Reads one byte at a time
				//default constructor is undefined by FileInputStream and DataInputStream, so add
				//file1.txt as the argument inside the parenthesis. 
				FileInputStream fileStream= new FileInputStream("file1.txt");
			
				//Reads primitive types
				//Pass the (fileStream) as the argument to the following constructor
				DataInputStream dataStream= new DataInputStream(fileStream);
				
				while(dataStream.available() > 0) {
         
				    //read character
				    char c = dataStream.readChar();

				    //print
				    System.out.print(c);
				}
				
				break;
			}
			
			catch(FileNotFoundException e) {
				
				//Tells the user where the working directory is at.
				String workingDirectory = new File(".").getAbsolutePath();
				
				
				JOptionPane.showMessageDialog(null, "FileNotFoundException: "
						+ "\"file1.txt\" not found in \n" 
						+ workingDirectory);
				
			}	
		}
		
		//At this point, dataStream points to a valid file!
		try {
			FileWriter encrypt= new FileWriter(new File ("file2.txt"));
			
			while(dataStream.available() > 0) {
				String output= "";
				
				
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

