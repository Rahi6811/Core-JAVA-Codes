import java.util.*;
import java.util.Scanner;
public class frech {
	public static void main(String[] args){
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		n2=sc.nextInt();
		System.out.print("Operator is(+, -, /, * ): ");
		char operator=sc.next().charAt(0);
		
		sc.close();
		
		int output,TimeUnit;
		switch(operator)
		{
		case '+':
			output=n1+n2;
			System.out.println("Sum is: "+output);
			//TimeUnit.MINUTES.sleep(1);
			break;
			
		case '-':
			output=n1-n2;
			System.out.println("Substraction is : "+output);
			break;
		case '*':
			output=n1*n2;
			System.out.println("Multiplication is: "+output);
			break;
		case '/':
			output=n1/n2;
			System.out.println("Division is: "+output);
			break;
			default:System.out.println("Invalid Choice");
			break;
		}
		}
		
	}


