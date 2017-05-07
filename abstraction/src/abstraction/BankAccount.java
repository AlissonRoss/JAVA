/**
 * Alisson Leiva Salazar
 */
package abstraction;

public abstract class BankAccount {
	private double balance;
	private double annInt;
	private double monthServ;
	
	
	//GETTERS/ACCESSORS
	public double getBalance() {
		return balance;
	}
	public double getMonthServ() {
		return monthServ;
	}
	
	//SETTERS/MUTATORS
	public void setBalance(double b) {
		this.balance = b;
	}
	public void setMonthServ(double m) {
		this.monthServ = m;
	}
	
	//Constructors
	public BankAccount(){
		balance=0;
		annInt=0;
		setMonthServ(0);
	}
	
	public BankAccount(double b, double a){
		
		this.balance=b;
		this.annInt=a;
		this.setMonthServ(10);
		
		
	}
	
	public void deposit(double dep){
		
		setBalance(getBalance()+dep);
	}
	
	public void withdraw(double wit){
		
		setBalance(getBalance()-wit);
		
	}
	
	abstract double monthlyProcess();
	

	
}
