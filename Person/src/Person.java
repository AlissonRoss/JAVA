
public class Person {
	
	
	private String name;
	private String gender;
	private int age;
	
	//Accessors/Getters 
	public String getName(){
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public int getAge(){
		return this.age;
	}
	//Mutators/Setters
	public void setName(String n){
		name=n;
	}
	
	public void setGender(String g){
		gender=g;
	}
	
	public void setAge(int a){
		age=a;
		
	}
	//Constructor that initializes with empty fields
	public Person(){
		this.name="";
		this.gender="";
		this.age=0;
				
	}
	//Constructor that validates, refines Data Types inside the parameter,
	//and assigns locally created variables into the Person Class
	public Person(String n, String g, int a){
		this.name=n; 
		this.gender=g;
		this.age=a;
		
	}
}

