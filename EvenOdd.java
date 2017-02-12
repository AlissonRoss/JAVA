import java.util.*;
public class EvenOdd {
	public static void main(String [] args){
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		number= scanner.nextInt();
		
		if (number % 2 == 0)
			System.out.print ("Even");
		else 
			System.out.print("Odd");
		
	}
		
}
