import java.util.*;
import java.util.Scanner;
	
public class reverse {
	public static void main(String[] args)
	{
		int temp,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
	a=sc.nextInt();
	System.out.println("Enter the value of b: ");
	b=sc.nextInt();
	System.out.println("before swapping the value of a is: "+a);
	System.out.println("before swapping the value of b is : "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping the value of a is : "+a);
	System.out.println("after swapping the value of b is : "+b);
	
	}

}
