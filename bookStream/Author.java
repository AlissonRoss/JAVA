package bookStream;

/*
The Author class holds the author's first name. last name, age as data fields. 
The Author class also has methods to return the data fields (getFirstName to return the first name, getLastName to return the last name, 
and getAge to return the age).
 */
public class Author {
	private String firstName;
	private String lastName;
	private int authorAge;	
	
	public Author(String f, String l, int a) {
		
		firstName=f;
		lastName=l;
		authorAge=a;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return authorAge;
	}
}
