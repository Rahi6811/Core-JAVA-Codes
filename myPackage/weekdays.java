import java.util.*;
import java.util.Scanner;

public class weekdays {
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day in week: ");
		a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wensday");
		break;
		case 4: System.out.println("thursday");
		break;
		case 5: System.out.println("Fridy");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7: System.out.println("Today is the SUNDAY ..OHH its Holiday ..ENJOY IT...");
		break;
		
		default:System.out.println("Invalid number this is not a week day..SORRY");
		break;
		
		}
		
	}

}
