import java.util.*;
import java.util.Scanner;
public class pattern11 {
	public static void main(String... args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			//System.out.println();
		
		for(j=i-1;j>=1;j--)
		{
			System.out.print(j+"");
		}
		System.out.println();
		
		}
	sc.close();
	}

}
