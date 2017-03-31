import javax.swing.*;

public class PersonMain {
	
	public static void main(String [] args){
		
		Person person1= new Person("Ali","Female",20);
		JOptionPane.showMessageDialog(null, "Name: "+person1.getName()+
				"\nGender: "+person1.getGender()+
				"\nAge: "+person1.getAge());
		
	}

}
