import java.util.*;
import java.util.Scanner;
public class inpfruser {
	public static void main(String[] args)
	{
		int num;
		float num1;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=sc.nextInt();
		System.out.println("You Entered: "+num);
		
		System.out.println("Enter String: ");
		s=sc.nextLine();
		System.out.println("You Entered: "+s);
		System.out.println("Enter Float Number: ");
		num1=sc.nextFloat();
		System.out.println("You Entered: "+num1);
	}

}
