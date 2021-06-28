import java.util.*;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		a=sc.nextInt();
		if(a %4==0)
		{
			System.out.println("The given year is leap year : "+a);
			
		}
		else
		{
			System.out.println("The given year is not a leap year: "+a);
			
		}
	}
}
