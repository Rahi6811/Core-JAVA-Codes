import java.util.*;
public class evenorodd {
	public static void main(String[] aregs)
	{
		int a;
		System.out.println("Enter the value of a : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("The given number is even: "+a);
		}
		else 
		{
			System.out.println("The given number is odd: "+a);
		}
	}

}
