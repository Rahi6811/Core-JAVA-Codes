//import java.util.*;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in how many rows you required pattern: ");
		rows=sc.nextInt();
		System.out.println("YOur pattern is : ");
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			System.out.println();
		}
		sc.close();
	}

}
