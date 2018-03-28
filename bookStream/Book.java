package bookStream;
/*

Question: Using Streams to Get the unique surnames in uppercase of the first 10 book authors that are 50 years old or older.

Assume that a variable library is defined as an ArrayList. 
Each Element in the arraylist, representing a book, is an object from a Book class. 
The Book class has the book's name (a string), 
book ISBN number (a string), 
and the author as data fields (an object from the Author class). 
The Book class has a method getAuthor to return the author of the book.

Requirements:

1. define the Author class and Book class

2. In the demo program, create the library as an ArrayList and add 20 books to the arraylist

3. In the demo program, using stream to get the unique surnames in uppercase of the 
first 10 book authors that are 50 years old or older.
 */
	

public class Book {

	private String bookName;
	private String ISBN;
	private Author authorName;
	
	//GETTERS
	public String getBookName() {
		return bookName;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public Author getAuthor() {
		
		return authorName;
		
	}
	
	//CONSTRUCTOR
	public Book(String b, String i, Author a){
		bookName=b;
		ISBN=i;
		authorName=a;
		
	}
	

}
