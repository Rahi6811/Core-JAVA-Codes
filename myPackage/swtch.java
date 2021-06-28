import java.util.*;
public class swtch {
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		System.out.println("Enter any number for showing one of thew Message: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		switch(x)
		{
		case 10: System.out.println("Hello");
		break;
		case 20: System.out.print("hi");
		break;
		default: System.out.println("Invalid");
		break;
		}
	}

}
