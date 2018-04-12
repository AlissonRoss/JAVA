import java.util.Arrays;
import java.util.Stack;

import javax.swing.JOptionPane;
/*
Design a program to use stack to calculate a mathematics equation. 
The program will ask the user enter a mathematics equation 
(such as ((-5)*4-(3-7)*5/2.5 or other equations).
Then the program will use stack to implement the calculation of the equation and display the result.

Hints:

1. a stack for operators

2. a stack for operands

3. pay attention to negative (-), it is an unary operator

4. pay attention to the match of parenthesis

5. you can write your own stack class or use the stack class in JCF
 */
public class StackCalc {
	public static void main(String[] args) {
		String expression = '(' + "(-5)*4-(3-7)*5/2.5" + ')';
	
		
		Stack<Character> stackOperator= new Stack<>();
		
		Stack<Double> stackOperand= new Stack<>();
		
		
		//for loop to iterate through the mathematical expression
		for(int i = 0;i < expression.length();i++) {
			char temp = expression.charAt(i);
			
			
			//nested if statement- if the expression contains any of the string elements
			//within the operatorArray, .push into the StackOperator
			if(temp=='/' || temp=='*' || temp=='+' || temp=='-') {
				stackOperator.push(temp);
				
			}
			
			//else, .push to stackOperand if not null
			else {
				stackOperand.push((double) temp);
				
				if (stackOperator.peek() == '*') {
				    stackOperand.push(stackOperand.pop()*stackOperand.pop());
				    stackOperator.pop();
				}
				else if (stackOperator.peek() == '/') {
				    stackOperand.push(1.0/stackOperand.pop()*stackOperand.pop());
				    stackOperator.pop();
				}
				//else if(stackOperator.peek()=='('&& stackOperator.peek()==')') {
					
				//}
		
			}
			
		}
		
		JOptionPane.showMessageDialog(null,"Chars inside Operator Stack: "
				+Arrays.toString(stackOperator.toArray())
				+"\nChars inside Operand Stack: "
				+Arrays.toString(stackOperand.toArray())
				+"\nResult: "
				+"");
				
		
	}
	public static int intValue(Stack<Character> stackOperand, Stack<Character> stackOperator) {
		int tempStack = 0;
		//while stackOperand isnt empty, check the operator and then perform the operation on the 
		//two elements within the stackOperand
		while(!stackOperand.isEmpty()) {
			int value = stackOperator.pop();
			switch (value){
		    	case '/': 
		    		tempStack+=(stackOperand.pop() / stackOperand.pop());
		        case '*': 
		            tempStack+=(stackOperand.pop() * stackOperand.pop());
		        case '+': 
		            tempStack+=(stackOperand.pop() + stackOperand.pop());
		        case '-': 
		            tempStack+=(stackOperand.pop() - stackOperand.pop());
			}
		}
		return tempStack;
	}
}
