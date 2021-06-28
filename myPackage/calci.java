import java.util.*;
import java.util.Scanner;
public class calci {
	public static void main(String[] args)
	{
		int n1,n2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		n2=sc.nextInt();
		System.out.println("Operator is(/, %, ^, <, >)");
		char operator=sc.next().charAt(0);
		switch(operator)
		{
		case '/':
		result=n1/n2;
		System.out.println("Division is : " +result);
		break;
		case '%':
			result=n1%n2;
			System.out.println("Modulo is : " +result);
			break;
		case '^':
			result=n1^n2;
			System.out.println("Exclusive OR is: "+result);
			break;
			
		case '<':
			if(n1<n2)
			{
				System.out.println("n2 is greter"+n2);
			break;
			}
			else{
				System.out.println("n1 is greter: "+n1);
				break;
			}
			
			default: System.out.println("Invalid Choice");
			break;
		}
		
	}

}
