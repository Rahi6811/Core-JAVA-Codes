import java.util.*;
import java.util.Scanner;

public class vowel {
	public static void main(String[] args)
	{
		char a;
		System.out.println("Enter any character: ");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		if(a==0 && a==9)
		{
			System.out.println("Sorry wrong choice");
		}
		else
		{
		switch(a)
		
		{
		
		
		case 'a':System.out.println("The given character is VOWEL");
		break;
		case 'e': System.out.println("The given character is VOWEL");
		break;
		default:System.out.println("The given input is CONSONENT");
		break;
		
		}
	}

}
}
