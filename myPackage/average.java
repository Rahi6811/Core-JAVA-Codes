import java.util.*;
import java.util.Scanner;
public class average {
	public static void main(String[] args)
	{
		int i,avg;
		int a[]={10,12,30,58};
		int total=0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("This is average code");
		//System.out.println("Enter numbers ");
		//a[]=sc.nextInt();
		for(i=0;i<=a.length;i++)
		{
			total=total+a[i];
		}
		//System.out.println("Sum is: "+total);
		avg=total/a.length;
		System.out.println("Avg is: "+avg);
	}

}
