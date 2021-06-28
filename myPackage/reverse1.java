import java.util.*;
import java.util.Scanner;
public class reverse1 {
	public static void main(String[] args)
	{
		int fno,sno,temp;
		System.out.println("Enter first Number: ");
		Scanner sc=new Scanner(System.in);
		fno=sc.nextInt();
		System.out.println("Enter Second Number: ");
		sno=sc.nextInt();
		//temp=sc.nextInt();
		temp=fno;
		fno=sno;
		sno=temp;
		System.out.println("After Reversing The number is : ");
		System.out.println("First Number is: "+fno);
		System.out.println("Second Number Is: "+sno);
		
		
		
	}

}
