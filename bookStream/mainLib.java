package bookStream;

import java.util.ArrayList;
import java.util.Random;
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

	3. In the demo program, using stream to get the unique surnames in uppercase of the first 10 book authors that 
	are 50 years old or older.
 */
import java.util.stream.Stream;

import javax.swing.JOptionPane;


public class mainLib {
	public static void main(String[] args) {		
		
		ArrayList<Book> library=new ArrayList<Book>(20);
		//1-10
		library.add(new Book ("Alisson's book", genISBN(), new Author("Alisson","leiva",21)));
		library.add(new Book ("Nathan's book #1", genISBN(), new Author("Nathan","leiva",55)));
		library.add(new Book ("Maria's book", genISBN(), new Author("Maria","pachuca",30)));
		library.add(new Book ("Alisson's book #2", genISBN(),new Author("Alisson","ross",50)));
		library.add(new Book ("Tuxedo's book", genISBN(),new Author("Tuxedo","Sotomayor",63)));
		library.add(new Book ("Imelda's book", genISBN(),new Author("Imelda","Salazar",85)));
		library.add(new Book ("Mario's book", genISBN(),new Author("Mario","Mendoza",35)));
		library.add(new Book ("Madison's book", genISBN(),new Author("Madison","Angeles",20)));
		library.add(new Book ("Maryen's book", genISBN(),new Author("Maryen","Mendoza",60)));
		library.add(new Book ("Jefferson's book", genISBN(),new Author("Jefferson","Alberto",55)));
		//11-20
		library.add(new Book ("Alisson's book #3", genISBN(),new Author("Alisson","Imelda",21)));
		library.add(new Book ("Nathan's book #2", genISBN(),new Author("Nathan","salazar",55)));
		library.add(new Book ("Gary's book", genISBN(),new Author("Gary","pachuca",30)));
		library.add(new Book ("Nicole's book", genISBN(),new Author("Nicole","brown",12)));
		library.add(new Book ("Li's book", genISBN(),new Author("Li","zhang",20)));
		library.add(new Book ("LeeAnn's book", genISBN(),new Author("LeeAnn","larson",56)));
		library.add(new Book ("Mercedes's book", genISBN(),new Author("Mercedes","Soto",70)));
		library.add(new Book ("Ingrid's book", genISBN(),new Author("Ingrid","leiva",46)));
		library.add(new Book ("Nathan's book #3", genISBN(),new Author("Nathan","ross",60)));
		library.add(new Book ("Miasos' book", genISBN(),new Author("Miasos","leivasos",80)));
		
	
		Stream<Book> streamedLib = library.stream();
		
		Stream<Book> booksOfOldAuthors = streamedLib.filter(
				(book) -> book.getAuthor().getAge() > 50
		).limit(10);
		
		Stream<String> oldAuthors = booksOfOldAuthors.map(
				(book) -> book.getAuthor().getLastName().toUpperCase()
		).distinct();
		
		StringBuilder outputStr=new StringBuilder();
		
		oldAuthors.forEach((name)->{
			outputStr.append(name);
			outputStr.append("\n");
		});
		
		JOptionPane.showMessageDialog(null,"Surnames of authors that are older than 50 years:\n"
				+outputStr.toString());
	}
	
	private static String genISBN() {
		Random random = new Random();
		return String.format("%d-%d-%d-%d-%d",
				random.nextInt(1000),
				random.nextInt(10),
				random.nextInt(100),
				random.nextInt(1000000),
				random.nextInt(10)
				);
	}
	

}
