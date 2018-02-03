package exception;

/**
 * 
 * @author Alisson Leiva Salazar
 *
 */

import javax.swing.JOptionPane;

public class PayrollMain {
	public static void main(String [] args){
		
		//Initializes new Payroll object in Main
		Payroll payroll01=payrollInput();
		
		JOptionPane.showMessageDialog(null, "Employee's ID # is "+payroll01.getIdNumber()+
				"\n"+payroll01.getEmployeeName()+"'s Gross Pay is $"
				+payroll01.getGrossPay());
		
	}
	//INSTANCES/OBJECTS
	private static Payroll payrollInput() {
		
		String name="";
		long id=0;
		double hour=0;
		double total=0;

		
		//Getting Input and parse it to create new Payroll object
		while(true) {
			try {
				name=JOptionPane.showInputDialog("Enter employee's name: ");
				
				//if no input, throw EmptyStringException
					if (name.isEmpty()) {
						throw (new EmptyStringException());
					}
					break;
				}
			catch(EmptyStringException e) {
				JOptionPane.showMessageDialog(null,"EmptyStringException: Enter a name.");
			}
		}
		
		
		
		
		//Getting ID Number
		while(true) {
			try {
				String idNum=JOptionPane.showInputDialog("Enter ID number: ");
				id=Long.parseLong(idNum);
				
				if(id < 1) {
					throw (new InvalidIDException());
				}
				
			break;
			}	
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NumberFormatException: Please enter a numeric value.");
				
			}
			catch(InvalidIDException e) {
				JOptionPane.showMessageDialog(null, "InvalidIDException: Enter a value higher than 0.");
						
				}
		}
		
			
		
		//Getting Hourly Pay Rate
		while(true) {
			try {
				String hourNum=JOptionPane.showInputDialog("Enter hourly pay rate: ");
				hour=Double.parseDouble(hourNum);
				if(hour < 0.0 || hour > 25.0) {
					throw(new InvalidHoursException());
				}
				
				break;	
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NumberFormatException: Please enter a numeric value.");
				
			}
			catch(InvalidHoursException e){
				JOptionPane.showMessageDialog(null, "InvalidHoursException: Entered a value that's "
						+ "a negative number or a number greater than 25.");
			}
				
			
		}	
			
		while(true)	{
			try {
				String totalNum=JOptionPane.showInputDialog("Enter number of hours worked: ");
				total=Double.parseDouble(totalNum);
				
				if(total < 0.0 || total > 84.0) {
					throw(new IllegalPayRateException());
				}
				
				
				break;	
				}
				
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NumberFormatException: Please enter a numeric value.");
				
				}
			catch(IllegalPayRateException e) {
				JOptionPane.showMessageDialog(null, "IllegalPayRateException: Entered a value that's "
						+ "a negative number or a number greater than 84.");
				
			
			}
		}	
	
		//Creating a new payroll for an employee
		Payroll payroll01=new Payroll(name,id);
		
		//Sends hour and total to corresponding setters/mutators
		payroll01.setHourlyPayrate(hour);
		
		payroll01.setTotalHours(total);
		
		//returns new object
		return payroll01;
	}

}
