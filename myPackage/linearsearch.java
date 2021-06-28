import java.util.*;
import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args)
	{
		int i,num,a[],search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers into array: ");
		num=sc.nextInt();
		a=new int[num];
		System.out.println("Enter"  + num +  "integers: ");
		for(i=0;i<num;i++)
		
			a[i]=sc.nextInt();
			System.out.println("Enter the number to be search: ");
			search=sc.nextInt();
		
			for(i=0;i<num;i++)
			{
				if(a[i]==search)
				{
				System.out.println("Number is present in the list");
			}
				else
					System.out.println("SORRY YOUR given NUMBER is not present ");
			
		}
		
	}

}
