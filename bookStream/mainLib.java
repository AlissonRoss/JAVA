package bookStream;

import java.util.ArrayList;
/*
 * Question: Using Streams to Get the unique surnames in uppercase of the first 10 book authors that are 50 years old or older.

Assume that a variable library is defined as an ArrayList. 
Each Element in the arraylist, representing a book, is an object from a Book class. 
The Book class has the book's name (a string), 
book ISBN number (a string), 
and the author as data fields (an object from the Author class). 
The Book class has a method getAuthor to return the author of the book.

The Author class holds the author's first name. last name, age as data fields. 
The Author class also has methods to return the data fields (getFirstName to return the first name, 
getLastName to return the last name, and getAge to return the age).

 

Requirements:

	1. define the Author class and Book class

	2. In the demo program, create the library as an ArrayList and add 20 books to the arraylist

	3. In the demo program, using stream to get the unique surnames in uppercase of the first 10 book authors that are 50 years old or older.
 */

import javax.swing.JOptionPane;


public class mainLib {
	public static void main(String[] args) {
		
		ArrayList<Book> library=new ArrayList<Book>(20);
		
		library.add(new Book ("Alisson's book", "123456789",new Author("Alisson","leiva",20)));
		
		JOptionPane.showMessageDialog(null, "Book's name: "
				+library.get(0).getBookName()
				+"\nISBN: "
				+library.get(0).getISBN()
				+"\nAuthor: "
				+library.get(0).getAuthor());
	}

}
